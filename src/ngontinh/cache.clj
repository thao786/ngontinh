(ns ngontinh.cache
	(:require 	[sodahead.render :as r]
				[clojure.java.io :as io]))


(r/cache "resources/HomePage.html" (slurp (io/resource "HomePage.html")))









