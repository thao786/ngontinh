(import 'java.sql.DriverManager)
(import 'java.sql.PreparedStatement)
(import 'java.sql.Statement)
(import 'java.sql.SQLException)
(import 'java.sql.Timestamp)
(import 'java.io.File)

(require '[clojure.string :as string])
(require 'ngontinh.handler)
(require '[ngontinh.ngontinh.defdata :as defndata])
(require '[cheshire.core :refer :all])





;reverse-genre-map
(def m
	(let [key-ar 	(keys l/genres)
			val-ar		(vals l/genres)]
		(zipmap val-ar key-ar)))

(defn woo [valu]
	(let [vallue (get m (.trim valu))]
		(str " " vallue " ")))





;inject in database
(def connection 
	(DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" 
		"postgres" "fall2010"))
(def stamp 	(Timestamp. (.getTime (java.util.Date.))))
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let 	[path 		(str (.getPath folder) "/Info.txt")
			colMap 		(load-string (slurp path))
			sqlStr  	(.prepareStatement connection (str 
							"INSERT INTO truyen (title, alternate, path, author, state, 
								genre, source, editor, translator, chap, date_Added, 
								view) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
			view		(+ 1000 (rand-int 9000))
			statement 	(doto sqlStr 
							(.setString 1 (colMap "title"))
							(.setString 2 (colMap "alternate"))
							(.setString 3 (.getName folder)) 
							(.setString 4 (colMap "author"))
							(.setInt 5 (colMap "state"))
							(.setString 6 (colMap "genre")) 
							(.setString 7 (colMap "source")) 
							(.setString 8 (colMap "editor"))
							(.setString 9 (colMap "translator"))
							(.setInt 10 (- (count (.listFiles folder)) 3))
							(.setTimestamp 11 stamp)
							(.setInt 12 view))]
		(.execute statement)))

(.close connection)







;get new genres str
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let 	[path 		(str (.getPath folder) "/Info.txt")
			mapm 	(load-string (slurp path))
			genre-str	(mapm "genre")
			genre-vec	(.split genre-str ",")
			genres (apply str (map woo genre-vec))
			new-map 	(assoc mapm "genre" genres)]
		(spit path new-map)))






;conver json to map
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let 	[path 		(str (.getPath folder) "/Info.txt")
			text 	(slurp path)]
		(if (.contains text ":")
			(let [mapm (parse-string text)]
				(spit path mapm))
			nil)))


