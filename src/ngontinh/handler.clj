(ns ngontinh.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(ns ngontinh.handler
	(:use 	compojure.core
			ring.middleware.cookies
          	ring.util.response
          	ring.util.response)
	(:require [compojure.handler :as handler]
            [compojure.route :as route]
            [clojure.java.io :as io]
            [ngontinh.view.core :as view]
            [ngontinh.ngontinh.defdata :as defndata]))
;(:require [my.lib :refer :all])


(defroutes app-routes
	(HEAD "/" [] "")
	(GET "/bootstrap.css" [] (io/resource "public/ngontinh/bootstrap.css"))
	(GET "/bootstrap-collapse.js" [] (io/resource "public/ngontinh/bootstrap-example/js/bootstrap-collapse.js"))
	(GET "/jquery.css" [] (io/resource "public/ngontinh/jquery.js"))
	(GET "/bootstrap-theme.css" [] (io/resource "public/ngontinh/bootstrap-theme.css"))
	(GET "/docs.css" [] (io/resource "public/ngontinh/bootstrap-example/docs/assets/css/docs.css"))
	(GET "/bootstrap-responsive.css" [] (io/resource "public/ngontinh/bootstrap-responsive.css"))
	(GET "/style1.css" [] (io/resource "public/ngontinh/style1.css"))
	(GET "/style2.css" [] (io/resource "public/ngontinh/style2.css"))
	(GET "/7.jpg" [] (io/resource "public/ngontinh/image/7.jpg"))
	(GET "/3.jpg" [] (io/resource "public/ngontinh/image/3.jpg"))
	(GET "/2.jpg" [] (io/resource "public/ngontinh/image/2.jpg"))
	(GET "/1.jpg" [] (io/resource "public/ngontinh/image/1.jpg"))
	(GET "/bgr.png" [] (io/resource "public/ngontinh/image/bgr.png"))
	(GET "/cungdau.jpg" [] (io/resource "public/ngontinh/image/cungdau.jpg"))
	(GET "/dammy.jpg" [] (io/resource "public/ngontinh/image/dammy.jpg"))
	(GET "/huyenhuyen.jpg" [] (io/resource "public/ngontinh/image/huyenhuyen.jpg"))
	(GET "/nguoc.jpg" [] (io/resource "public/ngontinh/image/nguoc.jpg"))
	(GET "/sac.jpg" [] (io/resource "public/ngontinh/image/sac.jpg"))
	(GET "/trongsinh.jpg" [] (io/resource "public/ngontinh/image/trongsinh.jpg"))
	(GET "/vongdu.jpg" [] (io/resource "public/ngontinh/image/vongdu.jpg"))
	(GET "/xuyenkhong.jpg" [] (io/resource "public/ngontinh/image/xuyenkhong.jpg"))
	(GET "/icon.png" [] (io/resource "public/ngontinh/image/icon.png"))
	(GET "/facebook.png" [] (io/resource "public/ngontinh/image/facebook.png"))
	(GET "/google+.png" [] (io/resource "public/ngontinh/image/google+.png"))
	(GET "/rss.png" [] (io/resource "public/ngontinh/image/rss.png"))
	(GET "/twitter.png" [] (io/resource "public/ngontinh/image/twitter.png"))
	(GET "/logo3.png" [] (io/resource "public/ngontinh/image/logo3.png"))
	(GET "/glyphicons-halflings-regular.eot" [] (io/resource "public/ngontinh/fonts/glyphicons-halflings-regular.eot"))
	(GET "/glyphicons-halflings-regular.woff" [] (io/resource "public/ngontinh/fonts/glyphicons-halflings-regular.woff"))
	(GET "/glyphicons-halflings-regular.ttf" [] (io/resource "public/ngontinh/fonts/glyphicons-halflings-regular.ttf"))
	(GET "/glyphicons-halflings-regular.svg" [] (io/resource "public/ngontinh/fonts/glyphicons-halflings-regular.svg"))


	(GET "/" [] (str (view/render "ngontinh/HomePage.html" defndata/Homepagedata)))
	(GET "/danhsachtruyen" [] (str (view/render "ngontinh/List_Truyen.html" defndata/Listtruyendata)))
	(GET "/advancedsearch" [] (str (view/render "ngontinh/Tim_nang_cao.html" defndata/Advancedsearchdata)))
	(GET "/doctruyen" [] (str (view/render "ngontinh/Doc_Truyen.html" defndata/Doctruyendata)))
	(GET "/ketquatimkiem" [] (str (view/render "ngontinh/KetQuaTimKiem.html" defndata/TimKiemdata)))
	(GET "/hoatudan" [] (str (view/render "ngontinh/DeDoPhu.html" defndata/Truyendata)))
	(GET "/chuong1" [] (str (view/render "ngontinh/DeDoPhuChuong1.html" defndata/Chapterdata)))
	(GET "/englishnovel" [] (str (view/render "ngontinh/EnglishNovel.html" defndata/Englishdata)))
	(GET "/rrh" [] (str (view/render "ngontinh/RedRidingHood.html" defndata/Storydata)))
	(GET "/chap1" [] (str (view/render "ngontinh/RRHChapter1.html" defndata/Engchapdata)))


	(route/resources "/")
	(route/not-found "Not Found"))


(def app
	(wrap-cookies (handler/site app-routes)))
	
