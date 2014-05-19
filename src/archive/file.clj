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







