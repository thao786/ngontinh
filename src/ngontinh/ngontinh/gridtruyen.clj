(ns ngontinh.ngontinh.gridtruyen
	(:require 	[ngontinh.ngontinh.libpath :as lib]
				[ngontinh.ngontinh.homepage :as hp]))

(import 'java.sql.DriverManager)

	

(defn getGenreCount [genre]
    (let    [resVec (let    [connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh"
                                                                    "postgres"
                                                                    "fall2010")
                            query       (str "select count(*) from truyen where genre like '%" genre "%'")
                        	res         (let [  stmt    (.createStatement connection)
                                                rs              (.executeQuery stmt query)]
                                                        (vec (resultset-seq rs)))
                            ddd             (.close connection)]
                            	res)
            row     (nth resVec 0)]
        (row :count)))


;(try (nth infoArray 1) (catch Exception e ""))
(defn Doctruyendata [page]
	(let 	[page 		(try (read-string page)  (catch Exception e 1))
			offset 		(* 20 (- page 1))]
		{:lib-path lib/lib-path 

		;cac the loai va so truyen; http = xem truyen cung genre
		:sidebar1 [{:theogenre (str lib/hostPath "listtruyen/co_dai") 		:genre "Cổ Đại" 	 :sotruyen (getGenreCount "Cổ Đại")}
				   {:theogenre (str lib/hostPath "listtruyen/hien_dai") 	:genre "Hiện Đại" 	 :sotruyen (getGenreCount "Hiện Đại")}
				   {:theogenre (str lib/hostPath "listtruyen/cung_dau") 	:genre "Cung Đấu"    :sotruyen (getGenreCount "Cung đấu")}
				   {:theogenre (str lib/hostPath "listtruyen/hai") 			:genre "Hài" 		 :sotruyen (getGenreCount "Hài")}
				   {:theogenre (str lib/hostPath "listtruyen/huyen_huyen") 	:genre "Huyền Huyễn" :sotruyen (getGenreCount "Huyền Huyễn")}   
				   {:theogenre (str lib/hostPath "listtruyen/xuyen_khong") 	:genre "Xuyên Không" :sotruyen (getGenreCount "Xuyên không")}]
		
		;truyen so view nhieu nhat
		:sidebar2 	(hp/getTruyen "select * from truyen order by view USING > limit 5")

		;truyen ngau nhien
		:sidebar3 	(hp/getTruyen "SELECT * FROM truyen ORDER BY RANDOM() LIMIT 5")

		;display cac truyen
		:truyen1 	(hp/getTruyen (str "select * from truyen limit 4 offset " offset))
		:truyen2 	(hp/getTruyen (str "select * from truyen limit 4 offset " (+ 4 offset)))
	 	:truyen3 	(hp/getTruyen (str "select * from truyen limit 4 offset " (+ 8 offset)))
		:truyen4 	(hp/getTruyen (str "select * from truyen limit 4 offset " (+ 12 offset)))
		:truyen5 	(hp/getTruyen (str "select * from truyen limit 4 offset " (+ 16 offset)))
		:tim "http"
	}))


(def Truyendata 
	{:lib-path lib/lib-path 
	:sidebar1 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
	:sidebar2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
			{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
	:tim "http"
	:titlepage {:titletruyen "Hoa Tu Dan" :state "Full" :author "Duong That Cong Tu"}
	:chuongmoi [{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
			 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
			 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
			 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
			 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}]				 
	:gioithieu {:shortoverview "ggggggggggggggggg" :remainoverview "sssssssssssssssssssssssssss" }
	:truyeninfo 
	:mucluc [{:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}]
	})	
=======
(defn Truyendata [title]
	(let 	[truyen 		(nth (hp/getTruyen (str "select * from truyen where path = '" title"'")) 0)
			genreList 		(truyen :genre)]
		{:lib-path lib/lib-path 

		;truyen cung the loai
		:sidebar1 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :title "Hoa" :author "Chu" :genre "Co Dai"}
				{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :title "That" :author "Ngoc" :genre "Co Dai"}	
				{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :title "Tu" :author "That" :genre "Co Dai"}
				{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :title "Dan" :author "Cong" :genre "Hien Dai"}
				{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :title "Duong" :author "That" :genre "Co Dai"}]
		
		;truyen cung tac gia
		:sidebar2 (hp/getTruyen (str "select * from truyen where author like '%" (truyen :author) "%'"))
		:tim "http"
		:titlepage {:title (truyen :title) :state "Full" :author (truyen :author)}
		:chuongmoi [{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
				 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
				 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
				 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
				 {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}]				 
		:gioithieu {:shortoverview "ggggggggggggggggg" :remainoverview "sssssssssssssssssssssssssss" }
		:truyeninfo {	:linkanh (truyen :linkanh) 
						:linktruyen (truyen :linktruyen) 
						:title (truyen :title)
						:alternate (truyen :alternate)
						:author (truyen :author)
						:searchauthor "http" 
						:genre (truyen :genre)
						:searchgenre "http" 
						:state "Full" 
						:searchstate "http" 
						:source (truyen :source)
						:person "esgegww" 
						:view (truyen :view)
						:date_added (truyen :date_added)}
		:mucluc [{:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :date_added "32/5/2014"}
			  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :date_added "32/5/2014"}
			  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :date_added "32/5/2014"}
			  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :date_added "32/5/2014"}
			  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :date_added "32/5/2014"}]
		}))


