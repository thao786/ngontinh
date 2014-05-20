(import 'java.io.File)
(require '[cheshire.core :refer :all])





;turn info.txt into json object
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
						"translator" (try (nth infoArray 7) (catch Exception e ""))}]
		()))










(doseq [folder (.listFiles (File. "/home/thao/Truyen2"))] 
	(let 	[path 		(str (.getPath folder) "/Info.txt")
			oldContent 	(slurp path)
			content 	(clojure.string/replace oldContent #"\r" "")
			infoArray 	(.split content "\n")		
			genre-str 	(try (nth infoArray 4) (catch Exception e ""))
			colMap 		{"title" (nth infoArray 0)
						"alternate" (try (nth infoArray 1) (catch Exception e ""))
						"author" (try (nth infoArray 2) (catch Exception e ""))
						"state" (if (.contains (nth infoArray 3) "1") 1 0)
						"genre" (try (nth infoArray 4) (catch Exception e ""))
						"source" (try (nth infoArray 5) (catch Exception e ""))
						"editor" (try (nth infoArray 6) (catch Exception e ""))
						"translator" (try (nth infoArray 7) (catch Exception e ""))}]
		(spit (File. path) colMap)))

