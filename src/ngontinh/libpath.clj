(ns ngontinh.libpath
	(:require 	[clojure.java.io :as io]))

(def hostPath "http://localhost:3000/")

(def genres {"chientruong" "Chiến Trường" 
				"codai" "Cổ Đại" 
				"congso" "Công Sở" 
				"cungdau" "Cung đấu" 
				"cungdinh" "Cung Đình" 
				"dammy" "Đam mỹ" 
				"doanvan" "Đoản Văn" 
				"dongnhan" "Đồng nhân" 
				"dienvan" "Điền văn" 
				"giangho" "Giang Hồ" 
				"hai" "Hài" 
				"hacbang" "Hắc bang" 
				"hiendai" "Hiện Đại" 
				"hoanthan" "Hoán Thân" 
				"huyenhuyen" "Huyền huyễn" 
				"kiemhiep" "Kiếm Hiệp"
				"nguoc" "Ngược" 
				"nhanthu" "Nhân thú" 
				"nuton" "Nữ tôn" 
				"nuphannamtrang" "Nữ phẫn nam trang" 
				"np" "NP" 
				"phuchacnam" "Phúc Hắc Nam" 
				"quannhan" "Quân nhân" 
				"sac" "Sắc" 
				"sung" "Sủng" 
				"sudoluyen" "Sư đồ luyến"
				"hocduong" "Học đường" 
				"tienhiep" "Tiên hiệp" 
				"trongsinh" "Trọng sinh" 
				"vongdu" "Võng du" 
				"xuyenkhong" "Xuyên không" 
				"he" "HE" 
				"se" "SE" 
				"oe" "OE"})

(def paths {:bootcss (str hostPath "bootstrap.css")
			   :bootcollapsejs (str hostPath "bootstrap-collapse.js")
			   :jquery (str hostPath "jquery.js")
			   :bootstheme (str hostPath "bootstrap-theme.css")
			   :docscss (str hostPath "docs.css")
			   :bootsresponsive (str hostPath "bootstrap-responsive.css")
			   :stylesheet (str hostPath "style1.css")
			   :stylesheet2 (str hostPath "style2.css")
			   :linkanh (str hostPath "7.jpg")
			   :linkanh1 (str hostPath "1.jpg")
			   :linkanh2 (str hostPath "2.jpg")
			   :linkanh3 (str hostPath "3.jpg")
			   :bgr (str hostPath "bgr.png")
			   :cungdau (str hostPath "cungdau.jpg")
			   :dammy (str hostPath "dammy.jpg")
			   :huyenhuyen (str hostPath "huyenhuyen.jpg")
			   :nguoc (str hostPath "nguoc.jpg")
			   :sac (str hostPath "sac.jpg")
			   :trongsinh (str hostPath "trongsinh.jpg")
			   :vongdu (str hostPath "vongdu.jpg")
			   :xuyenkhong (str hostPath "xuyenkhong.jpg")
			   :icon (str hostPath "icon.png")
			   :facebook (str hostPath "facebook.png")
			   :google+ (str hostPath "google+.png")
			   :rss (str hostPath "rss.png")
			   :twitter (str hostPath "twitter.png")
			   :logo3 (str hostPath "logo3.png")
			   :font1 (str hostPath "glyphicons-halflings-regular.eot")
			   :font2 (str hostPath "glyphicons-halflings-regular.woff")
			   :font3 (str hostPath "glyphicons-halflings-regular.ttf")
			   :font4 (str hostPath "glyphicons-halflings-regular.svg")})