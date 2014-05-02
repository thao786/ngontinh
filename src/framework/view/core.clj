(ns framework.view.core
	(:use 		compojure.core)
	(:require 	[clojure.java.io :as io]))

(defn render [file data] 
	(loop [	content 			(slurp (io/resource (str "public/" file)))]
		(if (> (.indexOf content "[[") -1) 
			(let [	open-br 	(+ 2 (.indexOf content "[["))
					close-br	(.indexOf content "]]")
					code		(.substring content open-br close-br)
					execc		(load-string (str "(def data " data ") " code))
					newContent	(str (.substring content 0 (- open-br 2))
									 execc
									 (.substring 	content 
									 				(+ 2 close-br) 
									 				(.length content)))]
						(recur newContent))
			content)))

