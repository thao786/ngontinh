(ns ngontinh.util.truyen
	(:require 	[ngontinh.libpath :as lib]
				[clojure.java.io :as io]))

(import 'java.sql.DriverManager)

(Class/forName "org.sqlite.JDBC")
(def connection-str "jdbc:sqlite:ngontinh.db")
(def username "postgres")
(def password "fall2010")

(defn getTruyen [query]
	(vec (let 	[connection (DriverManager/getConnection connection-str)
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [truyen mostRead]
								(let 	[name 			(truyen :path)									
										overview 		(try (slurp (str lib/local-file-path "Truyen/" name "/Overview.txt"))
															(catch Exception e (prn name)))
										linkanh 		(lib/getImageCover name)
										linktruyen 		(str lib/hostPath "vn/gridtruyen/read/" name) 
										shortoverview 	(clojure.string/replace 
															(clojure.string/trim 
																(subs overview 12 (min 300 (count overview)))) #"\n" "<br>")]
									(assoc truyen :shortoverview shortoverview :overview overview 
										:linkanh linkanh :linktruyen linktruyen)))
				dummy 		(.close connection)]
			addLink)))


(defn getTruyen2 [query]
	(vec (let 	[connection (DriverManager/getConnection connection-str)
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [truyen mostRead]
								(let 	[name 			(truyen :path)									
										overview 		(slurp (str lib/local-file-path "Stories/" name "/Overview.txt"))
										linkanh 		(lib/getImageCover name "a")
										linktruyen 		(str lib/hostPath "gridtruyen/read/" name) 
										shortoverview 	(clojure.string/replace (clojure.string/trim (subs overview 12 (min 300 (count overview)))) #"\n" "<br>")	]
									(assoc truyen :shortoverview shortoverview :overview overview :linkanh linkanh :linktruyen linktruyen)))
				ddd 		(.close connection)]
			addLink)))


(defn getChap [query]
	(vec (let 	[connection (DriverManager/getConnection connection-str)
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [chap mostRead]
								(let 	[truyen 	(chap :pathchuong)
										title       (chap :title)
										chap-num    (chap :chap)
										linktruyen  (str lib/hostPath "vn/gridtruyen/read/" truyen)
										linkchap 	(str lib/hostPath "vn/gridtruyen/read/" truyen "/" chap-num)] 
									(assoc chap :linkchap linkchap :linktruyen linktruyen)))
				ddd 		(.close connection)]
			addLink)))


(defn getChap2 [query]
	(vec (let 	[connection (DriverManager/getConnection connection-str)
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [chap mostRead]
								(let 	[truyen 	(chap :pathchuong)
										title       (chap :title)
										chap-num    (chap :chap)
										linktruyen  (str lib/hostPath "gridtruyen/read/" truyen)
										linkchap 	(str lib/hostPath "gridtruyen/read/" truyen "/" chap-num)] 
									(assoc chap :linkchap linkchap :linktruyen linktruyen)))
				ddd 		(.close connection)]
			addLink)))


(defn getGenreCount [genre]
    (let [resVec (let [		connection (DriverManager/getConnection connection-str)
                            query (str "select count(*) from truyen where lower(genre) like'%" genre "%';")
                         	res (let [ stmt (.createStatement connection)
                                                rs (.executeQuery stmt query)]
                                                        (vec (resultset-seq rs)))
                            ddd (.close connection)]
                             res)
            row (nth resVec 0)]
        (row :count)))

(defn truyenCount [database]
    (let [resVec (let 	[connection (DriverManager/getConnection connection-str)
                         query (str "select count(*) as count from " database "")
                         res (let [ stmt (.createStatement connection)
                                                rs (.executeQuery stmt query)]
                                                        (vec (resultset-seq rs)))
                         ddd (.close connection)]
                             res)
            row (nth resVec 0)]
        (row :count)))
               
