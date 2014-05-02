(import 'java.sql.DriverManager)
(import 'java.sql.PreparedStatement)
(import 'java.sql.SQLException)
(import 'java.util.Scanner)
(import 'java.io.File)
(import 'java.util.Scanner)

(require '[clojure.string :as string])
(require 'ngontinh.handler)
(require '[ngontinh.ngontinh.defdata :as defndata])




(ns framework.view.core	 (:require 	[java.io.File :as io]))

[(do (defn lala [a b] (/ a b)) (def x 8) nil) (lala 8 7)]
[(do (import 'java.io.File) (def f (File. "gfd")) (.canRead f)) f]
[(ns nt) (import 'java.io.File) (File. "gtfrds")]



(def connection (DriverManager/getConnection "jdbc:postgresql://127.0.0.1:5432/truyen" "postgres" "fall"))

(def sqlString "INSERT INTO truyen (name, alternateName, author, uploadComplete, genre, source, editor,translator ) VALUES ('tgrf', 'haha', 'haha', 543 , 'haha', 'haha', 'haha', 'haha')")

(def statement (.prepareStatement connection sqlString))

(.execute statement)

(def f (File. "/home/thao/Truyen"))

;rename them
(doseq [x (.listFiles (File. "/home/thao/Truyen"))] 
	(prn (.getName x)))




;inject in database
(doseq [x (.listFiles (File. "/home/thao/Truyen"))] 
(prn (let 	[path 		(str (.getPath x) "/info")
		oldContent 	(slurp path)
		content 	(clojure.string/replace oldContent #"\r" "")
		infoArray 	(.split content "\n")		
		colMap 		{"title" (nth infoArray 0)
					"alternate" (try (nth infoArray 1) (catch Exception e ""))
					"author" (try (nth infoArray 2) (catch Exception e ""))
					"state" 1
					"genre" (try (nth infoArray 4) (catch Exception e ""))
					"source" (try (nth infoArray 5) (catch Exception e ""))
					"editor" (try (nth infoArray 6) (catch Exception e ""))
					"translator" (try (nth infoArray 7) (catch Exception e ""))}
		sqlStr  	(.prepareStatement connection (str "INSERT INTO truyen (title, alternate, path, author, state, genre, source, editor, translator, numberofchap) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"))
		statement 	(doto sqlStr 
						(.setString 1 (colMap "title"))
						(.setString 2 (colMap "alternate")) 
						(.setString 3 (.getName x)) 
						(.setString 4 (colMap "author"))
						(.setInt 5 1)
						(.setString 6 (colMap "genre")) 
						(.setString 7 (colMap "source")) 
						(.setString 8 (colMap "editor"))
						(.setString 9 (colMap "translator"))
						(.setInt 10 (- (count (.listFiles x)) 3)))]
	(.execute statement))))






;remove chapter line
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))] 
	(doseq [file (.listFiles folder)]
		(if (.matches (.getName file) "[0-9]*.txt")
			(let [oldContent 	(slurp file)
				firstNewLine	(+ 1 (.indexOf oldContent "\n"))
					newContent 	(.substring oldContent firstNewLine 
								(.length oldContent))]
				(spit (.getPath file) newContent)))))










