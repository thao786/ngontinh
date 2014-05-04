(import 'java.sql.DriverManager)
(import 'java.sql.PreparedStatement)
(import 'java.sql.SQLException)
(import 'java.util.Scanner)
(import 'java.io.File)
(import 'java.util.Scanner)

(require '[clojure.string :as string])
(require 'ngontinh.handler)
(require '[ngontinh.ngontinh.defdata :as defndata])
(import 'java.sql.Timestamp)



(ns framework.view.core	 (:require 	[java.io.File :as io]))

[(do (defn lala [a b] (/ a b)) (def x 8) nil) (lala 8 7)]
[(do (import 'java.io.File) (def f (File. "gfd")) (.canRead f)) f]
[(ns nt) (import 'java.io.File) (File. "gtfrds")]



(def connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" "postgres" "fall2010"))

(def sqlString "INSERT INTO truyen (name, alternateName, author, uploadComplete, genre, source, editor, translator) VALUES ('tgrf', 'haha', 'haha', 543 , 'haha', 'haha', 'haha', 'haha')")

(def statement (.prepareStatement connection sqlString))

(.execute statement)

(def f (File. "/home/thao/Truyen"))

;inject in database
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
(prn (let 	[path 		(str (.getPath folder) "/Info.txt")
		oldContent 	(slurp path)
		content 	(clojure.string/replace oldContent #"\r" "")
		infoArray 	(.split content "\n")		
		colMap 		{"title" (nth infoArray 0)
					"alternate" (try (nth infoArray 1) (catch Exception e ""))
					"author" (try (nth infoArray 2) (catch Exception e ""))
					"state" (if (.contains (nth infoArray 3) "1") 1 0)
					"genre" (try (nth infoArray 4) (catch Exception e ""))
					"source" (try (nth infoArray 5) (catch Exception e ""))
					"editor" (try (nth infoArray 6) (catch Exception e ""))
					"translator" (try (nth infoArray 7) (catch Exception e ""))}
		sqlStr  	(.prepareStatement connection (str 
						"INSERT INTO truyen (title, alternate, path, author, state, 
							genre, source, editor, translator, chap, date_Added, view) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
		stamp 		(Timestamp. (.getTime (java.util.Date.)))
		view		(* 50 (rand-int 60))
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
	(try (.execute statement) 
		(catch Exception e (prn path))))))




(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let [content 	(slurp (str (.getPath folder) "/Info.txt"))]
		(prn content)))





;rename pictures
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(doseq [file (.listFiles folder)]
		(if (.matches (.getName file) "[a-zA-Z]*.jpg")
			(let [oldName 	(.getPath file)
				newName 	(str (.getPath folder) "/cover.jpg")]
				(.renameTo file (File. newName))))))







(import 'java.io.File)
;add _ to folder name
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let 	[oldName	(.getName folder)
			newName		(clojure.string/replace oldName #" " "_")]
		(.renameTo folder (File. (str "/home/thao/Truyen/" newName)))))




;rename all to .txt
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let 	[infoFile	(str (.getPath folder) "/info.txt")
			newFile		(str (.getPath folder) "/Info.txt")]
		(.renameTo (File. infoFile) (File. newFile))))





;delete all Info.txt
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(let 	[infoFile	(str (.getPath folder) "/Info.txt")]
		(.delete (File. infoFile))))