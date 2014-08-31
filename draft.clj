(require '[taoensso.carmine :as car :refer (wcar)])
(def server1-conn {:pool {:max-active 8} 
		:spec {:host "localhost" :port 6379}})
(defmacro wcar* [& body] `(car/wcar server1-conn ~@body))

(defn f3 [msg]
	(wcar* (car/publish "foobar" (rand 1000))))

(def listener
	(car/with-new-pubsub-listener
		(:spec server1-conn)
		{"lala" f3}
		(car/subscribe "lala")))

(wcar* (car/publish "lala" "Hello to foobar!"))




(defprotocol Fly
  "A simple protocol for flying"
  (fly [this] "Method to fly")
  (sit [a] ""))







