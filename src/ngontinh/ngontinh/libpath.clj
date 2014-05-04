
(ns ngontinh.ngontinh.libpath
	(:use 		compojure.core)
	(:require 	[clojure.java.io :as io]))

(def hostPath "http://localhost:3000/")

(def lib-path {:bootcss (str hostPath "bootstrap.css")
			   :bootcollapsejs "http://localhost:3000/bootstrap-collapse.js"
			   :jquery "http://localhost:3000/jquery.js"
			   :bootstheme "http://localhost:3000/bootstrap-theme.css"
			   :docscss "http://localhost:3000/docs.css"
			   :bootsresponsive "http://localhost:3000/bootstrap-responsive.css"
			   :stylesheet "http://localhost:3000/style1.css"
			   :stylesheet2 "http://localhost:3000/style2.css"
			   :linkanh "http://localhost:3000/7.jpg"
			   :linkanh1 "http://localhost:3000/1.jpg"
			   :linkanh2 "http://localhost:3000/2.jpg"
			   :linkanh3 "http://localhost:3000/3.jpg"
			   :bgr "http://localhost:3000/bgr.png"
			   :cungdau "http://localhost:3000/cungdau.jpg"
			   :dammy "http://localhost:3000/dammy.jpg"
			   :huyenhuyen "http://localhost:3000/huyenhuyen.jpg"
			   :nguoc "http://localhost:3000/nguoc.jpg"
			   :sac "http://localhost:3000/sac.jpg"
			   :trongsinh "http://localhost:3000/trongsinh.jpg"
			   :vongdu "http://localhost:3000/vongdu.jpg"
			   :xuyenkhong "http://localhost:3000/xuyenkhong.jpg"
			   :icon "http://localhost:3000/icon.png"
			   :facebook "http://localhost:3000/facebook.png"
			   :google+ "http://localhost:3000/google+.png"
			   :rss "http://localhost:3000/rss.png"
			   :twitter "http://localhost:3000/twitter.png"
			   :logo3 "http://localhost:3000/logo3.png"
			   :font1 "http://localhost:3000/glyphicons-halflings-regular.eot"
			   :font2 "http://localhost:3000/glyphicons-halflings-regular.woff"
			   :font3 "http://localhost:3000/glyphicons-halflings-regular.ttf"
			   :font4 "http://localhost:3000/glyphicons-halflings-regular.svg"})