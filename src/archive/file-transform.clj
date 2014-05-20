(import 'java.io.File)

(use '[clojure.java.shell :only [sh]])




;convert all to utf-8
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))]
	(doseq [file (.listFiles (File. (.getPath folder)))]
		(cond
			(not (.matches (.getName file) ".*.txt"))
			nil

			(.contains ((sh "file" (.getPath file)) :out) "UTF-16")
			(spit (.getPath file) (slurp (.getPath file) :encoding "UTF-16LE")))))




;rename folder to include slash
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))]
	(let [namef 	(.getPath folder)
			newname 	(clojure.string/replace namef #" " "_")]
		(.renameTo folder (File. newname))))




;rename to cover.jpg
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))]
	(doseq [file (.listFiles (File. (.getPath folder)))]
		(let [namef 	(.getName file)
				paths 	(.getPath folder)]
			(if (.matches namef ".*.jpg")
				(.renameTo file (File. (str paths "/cover.jpg")))
				nil))))




;rename all to Info.txt
(doseq [folder (.listFiles (File. "/home/thao/Truyen2"))]
	(doseq [file (.listFiles (File. (.getPath folder)))]
		(let [namef 	(.getName file)
				paths 	(.getPath folder)]
			(if (.matches namef "info.txt")
				(.renameTo file (File. (str paths "/Info.txt")))
				nil))))





;get rid of all \n
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))]
	(let [file 	(str (.getPath folder) "/Info.txt")
			content 	(slurp file)
			newcontent 		(clojure.string/replace content #"\r" "")]
		(spit file newcontent)))





;turn all Info.txt info json objects
(doseq [folder (.listFiles (File. "/home/thao/Truyen"))]
	(let [file 	(str (.getPath folder) "/Info.txt")
			content 	(slurp file)
			info 	(.split content "\n")
		coll (for [line info]
				(let [pos 	(.indexOf line " ")]
					(if (pos? pos)
						(let [word 	(re-find #"[a-zA-Z]*" line)
								resto 	(.trim (subs line pos (count line)))]
								{word resto})
						nil)))
		new-map 	(apply merge coll)]
		(spit file (generate-string new-map))))





(doseq [folder (.listFiles (File. "/home/thao/Truyen"))]
	(let [file 	(str (.getPath folder) "/Info.txt")
			json 	(parse-string (slurp file))
			chap 	(- (count (.listFiles folder)) 3)
			newmap 	{"title" (json "title")
					"chap" chap
					"state" 1
					"alternate" (json "alternate")
					"author" (json "author")
					"genre" (json "genre")
					"source" (json "source")
					"editor" (json "editor")
					"translator" (json "translator")}]
		(spit file (generate-string newmap)))




(doseq [folder (.listFiles (File. "/home/thao/all"))]
	(let [file 	(str (.getPath folder) "/cover.jpg")
			ex 		(.exists (File. file))]
		(if ex
			nil
			(prn folder))))

