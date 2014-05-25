(ns ngontinh.cache
	(:require 	[sodahead.render :as r]))


(cache "resources/HomePage.html" (slurp (io/resource "HomePage.html")))









