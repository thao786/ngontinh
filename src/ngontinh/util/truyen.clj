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
										overview 		(str lib/hostPath "overview/" name)
										linkanh 		(str lib/hostPath "image/" name)
										linktruyen 		(str lib/hostPath "gridtruyen/" name) 
										shortoverview 	(clojure.string/replace (subs (slurp (str "resources/Truyen/" (x :path) "/Overview.txt")) 14 300) #"\n" "<br>")	]
									(assoc truyen :overview overview :linkanh linkanh :linktruyen linktruyen)))
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
										linkchap 	(str lib/hostPath "gridtruyen/" truyen "/" chap-num)] 
									(assoc chap :linkchap linkchap)))
				ddd 		(.close connection)]
			addLink)))


(def overview (slurp (str "resources\\Truyen\\" (doctruyen :path) "\\Overview.txt")))
(def first-overview (clojure.string/replace (subs overview 14 200) #"\n" "<br>")  )
(def remain-overview (clojure.string/replace (subs overview 200) #"\n" "<br>"))
(def gioithieu {:first-overview first-overview :remain-overview remain-overview})
               