(ns ngontinh.ngontinh.doctruyen
	(:require 	[ngontinh.ngontinh.libpath :as lib]
				[ngontinh.ngontinh.homepage :as hp]))

(import 'java.sql.DriverManager)


(def Doctruyendata 
	{:lib-path lib/lib-path 

	;cac the loai va so truyen; http = xem truyen cung genre
	:sidebar1 [{:theogenre (str lib/hostPath "listtruyen/" co_dai) :genre "Co Dai" :sotruyen "1000"}
			  {:theogenre (str lib/hostPath "listtruyen/" hien_dai) :genre "Hien Dai" :sotruyen "1000"}
			  {:theogenre "http" :genre "Huyen Huyen" :sotruyen "1000"}
			  {:theogenre "http" :genre "Dam My" :sotruyen "1000"}
			  {:theogenre "http" :genre "Trong Sinh" :sotruyen "1000"}
			  {:theogenre "http" :genre "Xuyen Khong" :sotruyen "1000"}]
	
	;truyen so view nhieu nhat
	:sidebar2 	(hp/getTruyen "select * from truyen order by view USING > limit 5")

	;truyen ngau nhien
	:sidebar3 	(hp/getTruyen "SELECT * FROM truyen ORDER BY RANDOM() LIMIT 5")

	;display cac truyen
	:truyen1 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}]
	:truyen2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}]
 	:truyen3 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}]
	:truyen4 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}]
	:truyen5 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}
			  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai" :state "Full" :view "5000"}]
	:tim "http"
})


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
	:truyeninfo {:linkanh (lib/lib-path :linkanh) :linktruyen "http" :titletruyen "Thiên hạ hoan ca" :alternate "Thần Tiên Cũng Ngắm Mưa Sao Băng" :author "Kieu Gia Kieu Tieu" :searchauthor "http" :genre "Cổ Đại, Huyền Huyễn, HE" :searchgenre "http" :state "Full" :searchstate "http" :source "langnangcoc.wordpress.com" :person "esgegww" :view "2000" :ngayup "54/35/2014"}
	:mucluc [{:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
		  {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}]
	})	

