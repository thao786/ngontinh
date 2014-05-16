(ns ngontinh.ngontinh.homepage
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


(def Homepagedata 
{	:lib-path lib/lib-path 
	:tim "http"

	;5 truyen co so view nhieu nhat
	:sidebar1 	(getTruyen "select * from truyen order by view USING > limit 5")
	
	; 5 truyen co ngay up gan nhat
	:sidebar2 	(getTruyen "select * from truyen order by date_added USING > limit 5")

	;10 truyen co ngay update chuong moi nhat
	:updatechap (getTruyen "select * from truyen order by date_added USING > limit 10")
	
	;4 truyen generate randomly
	:doctruyen1 (getTruyen "SELECT * FROM truyen ORDER BY RANDOM() LIMIT 4")	 
	
	;4 truyen generate randomly
	:doctruyen2 (getTruyen "SELECT * FROM truyen ORDER BY RANDOM() LIMIT 4")

	;4 truyen tieng anh generate randomly
	:engnovel	[{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "The Exorcist"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "One Piece"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Naruto"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Iin egb je"}]	
	
})

