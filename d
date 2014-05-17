 (try  (do ) (catch Exception e "Exception happened"))

(defn render [params]
	(let [blocks [ 
		(str "toi la moi con meo
				<br>
				")
		 (str "

		")
		 (try  (do 
			(def a 4)
			(def b "fox")
			nil
		) (catch Exception e "Exception happened"))
		 
		 (str "



		toi thik an ca <br>
		")
	 	(try (load-string "a")  (catch Exception e (str "%a")))
		 (str " <br> furry fox <br>
		")
	 	(try (+ 9 8) (catch Exception e "Exception happened"))
	 	(str "")
	]]
	(apply str blocks)))