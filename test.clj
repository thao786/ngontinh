(ns framework.view.core
	(:use 		compojure.core)
	(:require 	[clojure.java.io :as io]))

(import 'java.sql.DriverManager)
(import 'java.sql.PreparedStatement)

(import 'java.io.File)

(slurp "/home/thao/ngontinh/project.clj")

(def f (File. "/home/thao/a"))

(.exists f)
;(def x 9)
;x