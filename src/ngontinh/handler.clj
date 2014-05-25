(ns ngontinh.handler
        (:use   compojure.core
                ring.middleware.cookies
                ring.util.response)
        (:require [compojure.handler :as handler]
                  [sodahead.render :as r]  
                  [compojure.route :as route]
                  [clojure.java.io :as io]))
;lein ring uberwar
;username="tomcat" password="s3cret"

(defroutes app-routes
        (HEAD "/" [] "")
        (GET "/bootstrap.css" [] (io/resource "bootstrap/bootstrap.css"))
        (GET "/bootstrap-collapse.js" [] (io/resource "bootstrap/bootstrap-collapse.js"))
        (GET "/bootstrap-theme.css" [] (io/resource "bootstrap/bootstrap-theme.css"))
        (GET "/docs.css" [] (io/resource "bootstrap/docs.css"))
        (GET "/bootstrap-responsive.css" [] (io/resource "bootstrap/bootstrap-responsive.css"))
        (GET "/style1.css" [] (io/resource "stylesheetcss/style1.css"))
        (GET "/style2.css" [] (io/resource "stylesheetcss/style2.css"))
        (GET "/7.jpg" [] (io/resource "image/7.jpg"))
        (GET "/3.jpg" [] (io/resource "image/3.jpg"))
        (GET "/2.jpg" [] (io/resource "image/2.jpg"))
        (GET "/1.jpg" [] (io/resource "image/1.jpg"))
        (GET "/bgr.png" [] (io/resource "image/bgr.png"))
        (GET "/cungdau.jpg" [] (io/resource "image/cungdau.jpg"))
        (GET "/dammy.jpg" [] (io/resource "image/dammy.jpg"))
        (GET "/huyenhuyen.jpg" [] (io/resource "image/huyenhuyen.jpg"))
        (GET "/nguoc.jpg" [] (io/resource "image/nguoc.jpg"))
        (GET "/sac.jpg" [] (io/resource "image/sac.jpg"))
        (GET "/trongsinh.jpg" [] (io/resource "image/trongsinh.jpg"))
        (GET "/vongdu.jpg" [] (io/resource "image/vongdu.jpg"))
        (GET "/xuyenkhong.jpg" [] (io/resource "image/xuyenkhong.jpg"))
        (GET "/icon.png" [] (io/resource "image/icon.png"))
        (GET "/facebook.png" [] (io/resource "image/facebook.png"))
        (GET "/google+.png" [] (io/resource "image/google+.png"))
        (GET "/rss.png" [] (io/resource "image/rss.png"))
        (GET "/twitter.png" [] (io/resource "image/twitter.png"))
        (GET "/logo3.png" [] (io/resource "image/logo3.png"))
        (GET "/glyphicons-halflings-regular.eot" [] (io/resource "fonts/glyphicons-halflings-regular.eot"))
        (GET "/glyphicons-halflings-regular.woff" [] (io/resource "fonts/glyphicons-halflings-regular.woff"))
        (GET "/glyphicons-halflings-regular.ttf" [] (io/resource "fonts/glyphicons-halflings-regular.ttf"))
        (GET "/glyphicons-halflings-regular.svg" [] (io/resource "fonts/glyphicons-halflings-regular.svg"))
;       (GET "/image/:name" request (str request))
        (GET "/image/:name" [name]
                (io/resource (str "Truyen/" name "/cover.jpg")))
        (GET "/imageeng/:name" [name]
                (io/resource (str "Stories/" name "/cover.jpg")))
 
 
        (GET "/" [] (r/render "resources/HomePage.html"))

        (GET "/listtruyen" [] 
            (r/render "resources/listtruyen.html"))

        (GET "/gridtruyen/pgnumber/:index" [index] 
            (r/render "resources/gridtruyen.html" {:index index}))

        (GET "/listtruyen/:genre/:index" [genre index] 
            (r/render "resources/theloai.html" {:genre genre :index index}))

        (GET "/gridtruyen/:path" [path] 
            (r/render "resources/doctruyen.html" {:path path}))

        (GET "/gridtruyen/:path/:num" [path num] 
            (r/render "resources/Chuong.html" {:path path :num num}))

        (GET "/advancedsearch" [] 
            (r/render "resources/Tim_nang_cao.html"))

        (GET "/englishnovel/pgnumber/:index" [index] 
            (r/render "resources/EnglishNovel.html" {:index index}))

        (GET "/englishnovel/:path" [path] 
            (r/render "resources/readstory.html" {:path path}))

        (GET "/englishnovel/:path/:num" [path num] 
            (r/render "resources/Chapter.html" {:path path :num num}))

        (GET "/search" request 
            (r/render "resources/KetQuaTimKiem.html" 
                {:tukhoa ((request :query-params) "term")}))
 
        (route/resources "/")
        (route/not-found "Not Found"))
 
 
(def app
        (wrap-cookies (handler/site app-routes)))