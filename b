(ns sodahead1347)(require 	'[clojure.java.io :as io]
				'[sodahead.parse :as p]
				'[sodahead.prep :as pe])
(require '[clojure.java.io :as io])
(defn render [params]
(let [blocks [ (str "")
 (str "

my name is kitty

")
 (try  (do (+ 8 7)) (catch Exception e))
 (str "

hahahha

")
Math/PI (str "")
]]
(apply str blocks)))