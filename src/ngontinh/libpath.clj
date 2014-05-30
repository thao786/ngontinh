(ns ngontinh.libpath
	(:require 	[clojure.java.io :as io]))

(def staticPath "http://li679-206.members.linode.com:8000/")
;(def hostPath "http://li679-206.members.linode.com/")
(def hostPath "localhost")


(def genres {	"chientruong" "Chiến Trường" 
				"codai" "Cổ Đại" 
				"congso" "Công Sở" 
				"cungdau" "Cung Đấu" 
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

(def genres2 {	"chientruong" "chiến trường" 
				"codai" "cổ đại" 
				"congso" "công sở" 
				"cungdau" "cung đấu" 
				"cungdinh" "cung đình" 
				"dammy" "đam mỹ" 
				"doanvan" "đoản văn" 
				"dongnhan" "đồng nhân" 
				"dienvan" "điền văn" 
				"giangho" "giang hồ" 
				"hai" "hài" 
				"hacbang" "hắc bang" 
				"hiendai" "hiện đại" 
				"hoanthan" "hoán thân" 
				"huyenhuyen" "huyền huyễn" 
				"kiemhiep" "kiếm hiệp"
				"nguoc" "ngược" 
				"nhanthu" "nhân thú" 
				"nuton" "nữ tôn" 
				"nuphannamtrang" "nữ phẫn nam trang" 
				"np" "np" 
				"phuchacnam" "phúc hắc nam" 
				"quannhan" "quân nhân" 
				"sac" "sắc" 
				"sung" "sủng" 
				"sudoluyen" "sư đồ luyến"
				"hocduong" "học đường" 
				"tienhiep" "tiên hiệp" 
				"trongsinh" "trọng sinh" 
				"vongdu" "võng du" 
				"xuyenkhong" "xuyên không" 
				"he" "he" 
				"se" "se" 
				"oe" "oe"})

(def paths {:bootcss (str staticPath "bootstrap.css")
			   :bootcollapsejs (str staticPath "bootstrap-collapse.js")
			   :jquery (str staticPath "jquery.js")
			   :bootstheme (str staticPath "bootstrap-theme.css")
			   :docscss (str staticPath "docs.css")
			   :bootsresponsive (str staticPath "bootstrap-responsive.css")
			   :stylesheet (str staticPath "style1.css")
			   :stylesheet2 (str staticPath "style2.css")
			   :linkanh (str staticPath "7.jpg")
			   :linkanh1 (str staticPath "1.jpg")
			   :linkanh2 (str staticPath "2.jpg")
			   :linkanh3 (str staticPath "3.jpg")
			   :bgr (str staticPath "bgr.png")
			   :cungdau (str staticPath "cungdau.jpg")
			   :dammy (str staticPath "dammy.jpg")
			   :huyenhuyen (str staticPath "huyenhuyen.jpg")
			   :nguoc (str staticPath "nguoc.jpg")
			   :sac (str staticPath "sac.jpg")
			   :trongsinh (str staticPath "trongsinh.jpg")
			   :vongdu (str staticPath "vongdu.jpg")
			   :xuyenkhong (str staticPath "xuyenkhong.jpg")
			   :icon (str staticPath "icon.png")
			   :facebook (str staticPath "facebook.png")
			   :google+ (str staticPath "google+.png")
			   :rss (str staticPath "rss.png")
			   :twitter (str staticPath "twitter.png")
			   :logo3 (str staticPath "logo3.png")
			   :font1 (str staticPath "fonts/glyphicons-halflings-regular.eot")
			   :font2 (str staticPath "fonts/glyphicons-halflings-regular.woff")
			   :font3 (str staticPath "fonts/glyphicons-halflings-regular.ttf")
			   :font4 (str staticPath "fonts/glyphicons-halflings-regular.svg")})



