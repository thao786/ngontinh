(ns cream-soda.cache
        (:use   compojure.core
                        ring.middleware.cookies
                ring.util.response)
        (:require [compojure.handler :as handler]
            [clojure.java.io :as io]
            [clojure.core.cache :as cache]))

