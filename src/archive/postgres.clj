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
(doseq [folder (.listFiles (File. "/home/thao/Stories"))] 
	(let 	[path 		(str (.getPath folder) "/Info.txt")
			colMap 		(load-string (slurp path))
			sqlStr  	(.prepareStatement connection (str 
							"INSERT INTO truyeneng (title, alternate, path, author, state, 
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






;add chapters
(def connection 
	(DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" 
		"postgres" "fall2010"))
(def stamp 	(Timestamp. (.getTime (java.util.Date.))))

(time (doseq [folder (.listFiles (File. "/home/thao/Stories"))] 
	(doseq [file (.listFiles folder)] 
		(if (.matches (.getName file) "[0-9]+.txt")
			(let 	
				[text 	(slurp (.getPath file))
				pos 	(.indexOf text "\n")
				title 	(subs text 0 pos)
				chapnum-str 	(re-find #"[0-9]+" (.getName file))
				chapnum 	(Integer/parseInt chapnum-str)
				sqlStr  	(.prepareStatement connection (str 
								"INSERT INTO chapeng (title, num, truyen, date_added) 
								VALUES (?, ?, ?, ?)"))
				statement 	(doto sqlStr 
								(.setString 1 title)
								(.setInt 2 chapnum)
								(.setString 3 (.getName folder))
								(.setTimestamp 4 stamp))]
				(.execute statement))
			nil))))

(.close connection)










