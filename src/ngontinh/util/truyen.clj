(ns ngontinh.util.truyen
	(:require 	[ngontinh.libpath :as lib]))

(import 'java.sql.DriverManager)

(defn getTruyen [query]
	(vec (let 	[connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" 
															"postgres" 
															"fall2010")
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [truyen mostRead]
								(let 	[name 			(truyen :path)									
										overview 		(slurp (str "resources/Truyen/" name "/Overview.txt"))
										linkanh 		(str lib/hostPath "image/" name)
										linktruyen 		(str lib/hostPath "gridtruyen/" name) 
										shortoverview 	(clojure.string/replace (clojure.string/trim (subs overview 12 (min 300 (count overview)))) #"\n" "<br>")	]
									(assoc truyen :shortoverview shortoverview :overview overview :linkanh linkanh :linktruyen linktruyen)))
				ddd 		(.close connection)]
			addLink)))


(defn getChap [query]
	(vec (let 	[connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" 
															"postgres" 
															"fall2010")
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [chap mostRead]
								(let 	[truyen 	(chap :truyen)
										title       (chap :title)
										chap-num    (chap :num)
										linktruyen  (str lib/hostPath "gridtruyen/" truyen)
										linkchap 	(str lib/hostPath "gridtruyen/" truyen "/" chap-num)] 
									(assoc chap :linkchap linkchap :linktruyen linktruyen)))
				ddd 		(.close connection)]
			addLink)))


(defn getGenreCount [genre]
    (let [resVec (let [		connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh"
                                                                    "postgres"
                                                                    "fall2010")
                            query (str "select count(*) from (select lower(genre) from truyen) as theloai2 where lower like '%" genre "%'")
                         	res (let [ stmt (.createStatement connection)
                                                rs (.executeQuery stmt query)]
                                                        (vec (resultset-seq rs)))
                            ddd (.close connection)]
                             res)
            row (nth resVec 0)]
        (row :count)))


(def truyenCount 
    (let [resVec (let 	[connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh"
                                                                    "postgres"
                                                                    "fall2010")
                         query (str "select count(*) from truyen")
                         res (let [ stmt (.createStatement connection)
                                                rs (.executeQuery stmt query)]
                                                        (vec (resultset-seq rs)))
                         ddd (.close connection)]
                             res)
            row (nth resVec 0)]
        (row :count)))
               