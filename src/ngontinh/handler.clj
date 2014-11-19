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

        (GET "/liststory" [] 
            (r/render "danh-sach-truyen.html"))

        (GET "/gridtruyen/pgnumber/:index" [index] 
            (r/render "gridtruyen.html" {:index index}))

        (GET "/listtruyen/:genre/:index" [genre index] 
            (r/render "theloai.html" {:genre genre :index index}))

        (GET "/gridtruyen/:path" [path] 
            (r/render "doctruyen.html" {:path path}))

        (GET "/gridtruyen/:path/:num" [path num] 
            (r/render "Chuong.html" {:path path :num num}))

        (GET "/advancedsearch" [] 
            (r/render "old-timnangcao.html"))

        (GET "/englishnovel/pgnumber/:index" [index] 
            (r/render "EnglishNovel.html" {:index index}))

        (GET "/englishnovel/:path" [path] 
            (r/render "readstory.html" {:path path}))

        (GET "/englishnovel/:path/:num" [path num] 
            (r/render "Chapter.html" {:path path :num num}))

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