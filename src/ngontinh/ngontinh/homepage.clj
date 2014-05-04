(ns ngontinh.ngontinh.homepage
	(:require 	[ngontinh.ngontinh.libpath :as lib]))

(import 'java.sql.DriverManager)

(def connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" "postgres" "fall2010"))

;(def ^:private some-var :value)

(def ^:private sidebar1 
	(let 	[mostRead 	(let [query 	"select * from truyen order by view USING > limit 5"
							 	stmt 	(.createStatement connection)
							 	rs 		(.executeQuery stmt query)]
							(vec (resultset-seq rs)))
			addLink		(for [truyen mostRead]
							(let 	[name 		(truyen :path)
									linkanh 	(str lib/hostPath "image/" name)
									linktruyen 	(str lib/hostPath "doctruyen/" name)] 
								(assoc truyen :linkanh linkanh :linktruyen linktruyen)))]
		addLink))

(def Homepagedata 
{	:lib-path lib/lib-path 
	:tim "http"
	:sidebar1 (vec sidebar1)
	;5 truyen co so view nhieu nhat
	:sidebar2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
	; 5 truyen co ngay up gan nhat
	:updatechap [{:linktruyen "That" :titletruyen "Hoa" :linkchap "Chu" :chapnumber "34" :titlechap "abcjf wfwnj" :ngayup "23/5/2014"}
			   	 {:linktruyen "That" :titletruyen "Hoa" :linkchap "Chu" :chapnumber "34" :titlechap "abcjf wfwnj" :ngayup "23/5/2014"}
			   	 {:linktruyen "That" :titletruyen "Hoa" :linkchap "Chu" :chapnumber "34" :titlechap "abcjf wfwnj" :ngayup "23/5/2014"}
			   	 {:linktruyen "That" :titletruyen "Hoa" :linkchap "Chu" :chapnumber "34" :titlechap "abcjf wfwnj" :ngayup "23/5/2014"}
			   	 {:linktruyen "That" :titletruyen "Hoa" :linkchap "Chu" :chapnumber "34" :titlechap "abcjf wfwnj" :ngayup "23/5/2014"}]
	;10 truyen co ngay update chuong moi nhat
	:doctruyen1 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hohf knefj fe"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hohf knefj fe"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hohf knefj fe"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hohf knefj fe"}]	 
	;4 truyen generate randomly
	:doctruyen2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Iin egb je"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Iin egb je"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Iin egb je"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Iin egb je"}]
	;4 truyen generate randomly
	:engnovel	[{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "The Exorcist"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "One Piece"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Naruto"}
			  	 {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Iin egb je"}]	
	;4 truyen tieng anh random
})

(.close connection)