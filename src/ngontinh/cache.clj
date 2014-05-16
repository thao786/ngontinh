(ns ngontinh.cache
        (:use   compojure.core
                ring.middleware.cookies
                ring.util.response)
        (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [clojure.java.io :as io]
            [ngontinh.view.core :as view]
            [ngontinh.ngontinh.defdata :as defndata]
            [clojure.core.cache :as cache]))





(def C 
	(cache/fifo-cache-factory {:a 1 :b 2}))


(defn lookup []
	(if (cache/has? C :a)
        (cache/hit C :a)))