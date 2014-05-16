(ns ngontinh.ngontinh.listtruyen
	(:require 	[ngontinh.ngontinh.libpath :as lib]
				[ngontinh.ngontinh.homepage :as hp]))

(import 'java.sql.DriverManager)


(def Listtruyendata 
	{:lib-path lib/lib-path 
	 :theloai {:cungdau "http" :dammy "http" :huyenhuyen "http" :nguoc "http" :sac "http" :vongdu "http" :trongsinh "http" :xuyenkhong "http"}
					 ; truyen voi the loai tuong ung
	:tim "http"
	:sapxep {:theotitle "http" :theoauthor "http" :theogenre "http" :theoview "http" :theostate "http"}					 
					 ; sap xep list theo thu tu duoc click
	:listtruyen (hp/getTruyen "select * from truyen")
	
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

(def Theloaidata 0)

(def Listtruyendata 0)
