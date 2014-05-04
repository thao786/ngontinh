
(ns ngontinh.ngontinh.defdata
	(:use 		compojure.core)
	(:require 	[ngontinh.ngontinh.libpath :as lib]))

(def Listtruyendata {:lib-path lib/lib-path 
					 :theloai {:cungdau "http" :dammy "http" :huyenhuyen "http" :nguoc "http" :sac "http" :vongdu "http" :trongsinh "http" :xuyenkhong "http"}
					 ; truyen voi the loai tuong ung
					 :tim "http"
					 :sapxep {:theotitle "http" :theoauthor "http" :theogenre "http" :theoview "http" :theostate "http"}					 
					 ; sap xep list theo thu tu duoc click
					 :listtruyen [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai, Huyen Huyen, HE" :searchgenre "http" :view "5000" :shortoverview "ge ge we ge" :sochap "35" :state "Full" :alternate "gr"}
							   	  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}
							   	  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}
							   	  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}
							   	  {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}]
					; tat ca truyen
					})

(def Advancedsearchdata {:lib-path lib/lib-path 
					 	 :sidebar [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
						 ;5 truyen ngau nhien
						 :tim {:timthuong "http" :timnangcao "http"}
					})

(def Doctruyendata {:lib-path lib/lib-path 
					:sidebar1 [{:theogenre "http" :genre "Co Dai" :sotruyen "1000"}
							  {:theogenre "http" :genre "Hien Dai" :sotruyen "1000"}
							  {:theogenre "http" :genre "Huyen Huyen" :sotruyen "1000"}
							  {:theogenre "http" :genre "Dam My" :sotruyen "1000"}
							  {:theogenre "http" :genre "Trong Sinh" :sotruyen "1000"}
							  {:theogenre "http" :genre "Xuyen Khong" :sotruyen "1000"}]
					;
					:sidebar2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
					:sidebar3 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
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

(def Theloaidata {:lib-path lib/lib-path
				  :titlepage {:genre "Huyen Huyen"}
				  :sidebar1 [{:theogenre "http" :genre "Co Dai" :sotruyen "1000"}
							  {:theogenre "http" :genre "Hien Dai" :sotruyen "1000"}
							  {:theogenre "http" :genre "Huyen Huyen" :sotruyen "1000"}
							  {:theogenre "http" :genre "Dam My" :sotruyen "1000"}
							  {:theogenre "http" :genre "Trong Sinh" :sotruyen "1000"}
							  {:theogenre "http" :genre "Xuyen Khong" :sotruyen "1000"}]
				  :sidebar2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
					:sidebar3 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
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


(def TimKiemdata {:lib-path lib/lib-path 
				  :sidebar [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
				  :tim "http"
				  :tukhoa "hoatudan"
				  :listtruyen [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai, Huyen Huyen, HE" :searchgenre "http" :view "5000" :shortoverview "ge ge we ge" :sochap "35" :state "Full" :alternate "gr"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :searchauthor "http" :genre "Co Dai" :searchgenre "http" :sochap "35" :shortoverview "ge ge we ge" :view "5000" :state "Full" :alternate "gr"}]
				  :sapxep {:theotitle "http" :theochap "http" :theogenre "http" :theoview "http"}
				})	


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
					
(def Chapterdata {:lib-path lib/lib-path 
				  :sidebar [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
				  :tim "http"
				  :titlepage {:linktruyen "http" :titletruyen "Hoa Tu Dan" :chapnumber "1" :titlechap "Tan Kiep Phu Du"}
				  :headerpage {:chuongtruoc "http" :chuongsau "http" :titletruyen "Hoa tư dẫn" :chapnumber "1" :titlechap "Tận kiếp phù du"} 	
				  :chapcontent	"o<br>"
				  :footpage {:nguoiup "hitsugaya-uzumaki" :ngayup "20/04/2014"}
				  :mucluc [{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}]
				})

(def Englishdata {:lib-path lib/lib-path 
				  :sidebar1 [{:theogenre "http" :genre "Co Dai" :sotruyen "1000"}
							  {:theogenre "http" :genre "Hien Dai" :sotruyen "1000"}
							  {:theogenre "http" :genre "Huyen Huyen" :sotruyen "1000"}
							  {:theogenre "http" :genre "Dam My" :sotruyen "1000"}
							  {:theogenre "http" :genre "Trong Sinh" :sotruyen "1000"}
							  {:theogenre "http" :genre "Xuyen Khong" :sotruyen "1000"}]
				  :sidebar2 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
				  :sidebar3 [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
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


(def Storydata {:lib-path lib/lib-path 
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
				:titlepage {:titletruyen "Red Riding Hood" :author "Brothers Grimm"}
				:chuongmoi [{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
							{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
							{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
							{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
							{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}]				 
				:gioithieu {:shortoverview "ggggggggggggggggg" :remainoverview "sssssssssssssssssssssssssss" }
				:truyeninfo {:linkanh (lib/lib-path :linkanh) :linktruyen "http" :titletruyen "Thiên hạ hoan ca" :author "Kieu Gia Kieu Tieu" :searchauthor "http" :genre "Cổ Đại, Huyền Huyễn, HE" :searchgenre "http" :state "Full" :searchstate "http" :source "langnangcoc.wordpress.com" :person "esgegww" :view "2000" :ngayup "54/35/2014"}
				:mucluc [{:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
						 {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
						 {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
						 {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}
						 {:chapnumber "56" :linkchap "http" :titlechap "gegweg 4g4 g4wg" :ngayup "32/5/2014"}]
				})	

(def Engchapdata {:lib-path lib/lib-path 
				  :sidebar [{:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Hoa" :author "Chu" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "That" :author "Ngoc" :genre "Co Dai"}	
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Tu" :author "That" :genre "Co Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Dan" :author "Cong" :genre "Hien Dai"}
							   {:linkanh (lib/lib-path :linkanh) :linktruyen "That" :titletruyen "Duong" :author "That" :genre "Co Dai"}]
				  :tim "http"
				  :titlepage {:linktruyen "http" :titletruyen "Hoa Tu Dan" :chapnumber "1" :titlechap "Tan Kiep Phu Du"}
				  :headerpage {:chuongtruoc "http" :chuongsau "http" :titletruyen "Hoa tư dẫn" :chapnumber "1" :titlechap "Tận kiếp phù du"} 	
				  :chapcontent	"o<br>"
				  :footpage {:nguoiup "hitsugaya-uzumaki" :ngayup "20/04/2014"}
				  :mucluc [{:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}
						   {:linkchap "http" :chapnumber "45" :titlechap "Slh feu kfej fe"}]
				})