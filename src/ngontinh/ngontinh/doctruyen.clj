(ns ngontinh.ngontinh.doctruyen
	(:require 	[ngontinh.ngontinh.libpath :as lib]
				[ngontinh.ngontinh.homepage :as hp]))

(import 'java.sql.DriverManager)

(def connection (DriverManager/getConnection "jdbc:postgresql://23.239.1.206:5432/ngontinh" "postgres" "fall2010"))


(def Doctruyendata 
	{:lib-path lib/lib-path 

	;cac the loai va so truyen; http = xem truyen cung genre
	:sidebar1 [{:theogenre "http" :genre "Co Dai" :sotruyen "1000"}
			  {:theogenre "http" :genre "Hien Dai" :sotruyen "1000"}
			  {:theogenre "http" :genre "Huyen Huyen" :sotruyen "1000"}
			  {:theogenre "http" :genre "Dam My" :sotruyen "1000"}
			  {:theogenre "http" :genre "Trong Sinh" :sotruyen "1000"}
			  {:theogenre "http" :genre "Xuyen Khong" :sotruyen "1000"}]
	
	;truyen so view nhieu nhat
	:sidebar2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
	
	;truyen ngau nhien
	:sidebar3 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
			   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
	
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
	:tim "http"})


(def Truyendata {:lib-path lib/lib-path 
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

(.close connection)