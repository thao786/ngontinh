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





(Class/forName "org.sqlite.JDBC")
(def c (DriverManager/getConnection "jdbc:sqlite:ngontinh.db"))
(def stmt (.createStatement c))
(def query "create table truyen(parent_folder varchar(50), path varchar(50), title  varchar(50), alternate  varchar(50), author  varchar(50), state  varchar(2), genre  varchar(50), source  varchar(50), editor  varchar(50), translator  varchar(50), chapters int, view int)")

(.executeUpdate stmt query)
(.close stmt)
(.close c)




{"title" "Anh yêu em rất nhiều", "alternate" "", "author" "Cố Tô Lan", "state" 1, "genre" "Hiện Đại, HE", "source" "meoluoi247.wordpress.com", "editor" "mèo Kat, Zun, Trái Táo, Tiểu Kê, Yuki", "translator" ""}
/home/thao/projects/ngontinh/resources/Truyen

(doseq [folder (.listFiles (File. "C:\\Users\\Thuy\\Desktop\\truyen-update"))]
	(let [file (str (.getPath folder) "/Info.txt")
		mapinfo 	(load-string (slurp file))
		chapters 	(- (count (.listFiles folder)) 3)
		query 	"INSERT INTO truyen (parent_folder, title, alternate, author, state, genre, source, editor, translator, chapters, view, path) VALUES ('Truyen', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
		stmt 	(.prepareStatement c query)
		stmt 	(doto stmt 
					(.setString 1 (mapinfo "title"))
					(.setString 2 (mapinfo "alternate"))
					(.setString 3 (mapinfo "author"))
					(.setString 4 (str (mapinfo "state")))
					(.setString 5 (mapinfo "genre"))
					(.setString 6 (mapinfo "source"))
					(.setString 7 (mapinfo "editor"))
					(.setString 8 (mapinfo "translator"))
					(.setInt 9 chapters)
					(.setInt 10 (+ 2000 (rand-int 9000)))
					(.setString 11 (.getName folder)))]
		(.execute stmt)))




(doseq [folder (.listFiles (File. "/home/thao/projects/ngontinh/resources/static/Stories"))]
	(let [file (str (.getPath folder) "/Info.txt")
		mapinfo 	(load-string (slurp file))
		chapters 	(- (count (.listFiles folder)) 3)
		query 	"INSERT INTO story (parent_folder, title, alternate, author, state, genre, source, editor, translator, chapters, view, path) VALUES ('Stories', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
		stmt 	(.prepareStatement c query)
		stmt 	(doto stmt 
					(.setString 1 (mapinfo "title"))
					(.setString 2 (mapinfo "alternate"))
					(.setString 3 (mapinfo "author"))
					(.setString 4 (str (mapinfo "state")))
					(.setString 5 (mapinfo "genre"))
					(.setString 6 (mapinfo "source"))
					(.setString 7 (mapinfo "editor"))
					(.setString 8 (mapinfo "translator"))
					(.setInt 9 chapters)
					(.setInt 10 (+ 2000 (rand-int 9000)))
					(.setString 11 (.getName folder)))]
		(.execute stmt)))




(import 'java.io.File)
(import 'java.sql.DriverManager)

create table chuong(path varchar(50), title varchar(50), chap int)

(doseq [truyen (.listFiles (File. "/home/thao/projects/ngontinh/resources/static/Truyen"))]
	(doseq [chuong (.listFiles truyen)]
		(if (.matches (.getName chuong) "[0-9]*.txt")
			(let [chap 	(re-find #"\d+" (.getName chuong))
					content 	(slurp chuong)
					title 	(re-find #"[^\n\r]*" content)
					query 	"INSERT INTO chuong (path, title, chap) VALUES (?,?,?)"
					stmt 	(.prepareStatement c query)
					stmt 	(doto stmt 
								(.setString 1 (.getName truyen))
								(.setString 2 title)
								(.setInt 3 (Integer/parseInt chap)))]
				(.execute stmt)))))




create table chap(pathchuong varchar(50), title varchar(50), chap int);

(doseq [truyen (.listFiles (File. "/home/thao/projects/ngontinh/resources/static/Stories"))]
	(doseq [chuong (.listFiles truyen)]
		(if (.matches (.getName chuong) "[0-9]*.txt")
			(let [chap 	(re-find #"\d+" (.getName chuong))
					content 	(slurp chuong)
					title 	(re-find #"[^\n\r]*" content)
					query 	"INSERT INTO chap (pathchuong, title, chap) VALUES (?,?,?)"
					stmt 	(.prepareStatement c query)
					stmt 	(doto stmt 
								(.setString 1 (.getName truyen))
								(.setString 2 title)
								(.setInt 3 (Integer/parseInt chap)))]
				(.execute stmt)))))





















