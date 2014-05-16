(ns ngontinh.util.truyen
	(:require 	[ngontinh.ngontinh.libpath :as lib]))

(import 'java.sql.DriverManager)

(defn getTruyen [query]
	(vec (let 	[connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" 
															"postgres" 
															"fall2010")
				mostRead 	(let [	stmt 	(.createStatement connection)
								 	rs 		(.executeQuery stmt query)]
								(vec (resultset-seq rs)))
				addLink		(for [truyen mostRead]
								(let 	[name 		(truyen :path)
										linkanh 	(str lib/hostPath "image/" name)
										linktruyen 	(str lib/hostPath "doctruyen/" name)] 
									(assoc truyen :linkanh linkanh :linktruyen linktruyen)))
				ddd 		(.close connection)]
			addLink)))