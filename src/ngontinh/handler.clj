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
;nohup java -jar start.jar jetty.port=80 &

(defroutes app-routes
        (HEAD "/" [] "")
 
        (GET "/" [] (r/render "index.html"))

        (GET "/vn" [] (r/render "vn-index.html"))

        ;===============

        (GET "/liststory" [] 
            (r/render "danh-sach-truyen.html"))

        (GET "/vn/liststory" [] 
            (r/render "vn-danh-sach-truyen.html"))

        ;===============

        (GET "/gridtruyen/pgnumber/:index" [index] 
            (r/render "the-loai.html" {:index index}))

        (GET "/vn/gridtruyen/pgnumber/:index" [index] 
            (r/render "vn-the-loai.html" {:index index}))

        ;===============

        (GET "/gridtruyen/theloai/:genre/:index" [genre index] 
            (r/render "the-loai-specific.html" {:genre genre :index index}))

        (GET "/vn/gridtruyen/theloai/:genre/:index" [genre index] 
            (r/render "vn-the-loai-specific.html" {:genre genre :index index}))

        ;===============

        (GET "/gridtruyen/read/:path" [path] 
            (r/render "truyen-overview.html" {:path path}))

        (GET "/vn/gridtruyen/read/:path" [path] 
            (r/render "vn-truyen-overview.html" {:path path}))

        ;===============

        (GET "/gridtruyen/read/:path/:num" [path num] 
            (r/render "chuong.html" {:path path :num num}))

        (GET "/vn/gridtruyen/read/:path/:num" [path num] 
            (r/render "vn-chuong.html" {:path path :num num}))

        ;===============

        (GET "/advancedsearch" [] 
            (r/render "timnangcao.html"))

        (GET "/search" request 
            (r/render "KetQuaTimKiem.html" 
                {:tukhoa ((request :query-params) "term")}))

        (GET "/static/:name/:name2/:name3" req 
            (let [uri   (req :uri)
                file-path   (subs uri 1)]
                (io/resource file-path)))
        (GET "/static/:name/:name2" req 
            (let [uri   (req :uri)
                file-path   (subs uri 1)]
                (io/resource file-path)))

        (route/resources "/")
        (route/not-found "Not Found"))
 
 
(def app
        (wrap-cookies (handler/site app-routes)))