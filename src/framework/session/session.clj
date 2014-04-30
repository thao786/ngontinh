(ns framework.session.session
	(:import 	(java.security.SecureRandom)))

(def jrandom (java.security.SecureRandom.))

(defn newSid [] 
	(.toString (new BigInteger 130 jrandom) 32))

