(import 'java.sql.DriverManager)
(import 'java.sql.PreparedStatement)
(import 'java.sql.Statement)
(import 'java.sql.SQLException)
(import 'java.sql.Timestamp)
(import 'java.io.File)

(require '[clojure.string :as string])
(require 'ngontinh.handler)
(require '[ngontinh.ngontinh.defdata :as defndata])






(def m 
	(let [key-ar 	(keys l/genres)
			val-ar		(vals l/genres)]
		(zipmap val-ar key-ar)))

(defn woo [valu]
	(let [vallue (get m valu)]
		(str " " vallue " ")))

;inject in database
(def connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/test" "postgres" "fall2010"))
(def stamp 	(Timestamp. (.getTime (java.util.Date.))))
(doseq [folder (.listFiles (File. "/home/thao/ngontinh/resources/Truyen"))] 
	(let 	[path 		(str (.getPath folder) "/Info.txt")
			oldContent 	(slurp path)
			content 	(clojure.string/replace oldContent #"\r" "")
			infoArray 	(.split content "\n")		
			genre-str 	(try (nth infoArray 4) (catch Exception e ""))
			
			genre-arr 	(.split genre-str "[ ]*,[ ]*")
			genres 		(apply str (map woo genre-arr))

			colMap 		{"title" (nth infoArray 0)
						"alternate" (try (nth infoArray 1) (catch Exception e ""))
						"author" (try (nth infoArray 2) (catch Exception e ""))
						"state" (if (.contains (nth infoArray 3) "1") 1 0)
						"genre" genres
						"source" (try (nth infoArray 5) (catch Exception e ""))
						"editor" (try (nth infoArray 6) (catch Exception e ""))
						"translator" (try (nth infoArray 7) (catch Exception e ""))}
			sqlStr  	(.prepareStatement connection (str 
							"INSERT INTO truyen (title, alternate, path, author, state, 
								genre, source, editor, translator, chap, date_Added, view) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
			view		(+ 1000 (rand-int 9000))
			statement 	(doto sqlStr 
							(.setString 1 "wrong")
							(.setString 2 "") 
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


























(re-find #"[\n]{1}.*" (slurp (.getPath file)))) 





(def connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" "postgres" "fall2010"))
(def stamp 	(Timestamp. (.getTime (java.util.Date.))))
(doseq [folder (.listFiles (File. "/home/thao/ngontinh/resources/Truyen"))]
	(let [folder-path 	(.getPath folder)
		truyen-folder 	(.getName folder)]
		(doseq 	[file 	(.listFiles (File. folder-path))]
			(if (.matches (.getName file) "[0-9]+.txt")
				(let [whole-name (.getName file)
						chap 	(re-find #"[0-9]*" whole-name)
						chap-name 	(try (.trim 
								(re-find #".*[\s]+" (slurp (.getPath file)))) 
									(catch Exception e ""))
						sqlStr  	(.prepareStatement connection (str 
							"INSERT INTO chap (title, num, truyen, date_added) VALUES 
							(?, ?, ?, ?)"))						
						statement 	(doto sqlStr 
							(.setString 1 chap-name)
							(.setInt 2 (Integer/parseInt chap))										
							(.setString 3 truyen-folder) 
							(.setTimestamp 4 stamp))]						
					(try (.execute statement) (catch Exception e statement)))
				nil))))
(.close connection)




