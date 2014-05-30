(ns ngontinh.libpath
	(:require 	[clojure.java.io :as io]))

(def staticPath "http://li679-206.members.linode.com:8000/files/")
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

(def paths {:bootcss (str staticPath "bootstrap/bootstrap.css")
			   :bootcollapsejs (str staticPath "bootstrap/bootstrap-collapse.js")
			   :bootstheme (str staticPath "bootstrap/bootstrap-theme.css")
			   :docscss (str staticPath "bootstrap/docs.css")
			   :bootsresponsive (str staticPath "bootstrap/bootstrap-responsive.css")
			   :stylesheet (str staticPath "stylesheetcss/style1.css")
			   :stylesheet2 (str staticPath "stylesheetcss/style2.css")
			   :linkanh (str staticPath "image/7.jpg")
			   :linkanh1 (str staticPath "image/1.jpg")
			   :linkanh2 (str staticPath "image/2.jpg")
			   :linkanh3 (str staticPath "image/3.jpg")
			   :bgr (str staticPath "image/bgr.png")
			   :cungdau (str staticPath "image/cungdau.jpg")
			   :dammy (str staticPath "image/dammy.jpg")
			   :huyenhuyen (str staticPath "image/huyenhuyen.jpg")
			   :nguoc (str staticPath "image/nguoc.jpg")
			   :sac (str staticPath "image/sac.jpg")
			   :trongsinh (str staticPath "image/trongsinh.jpg")
			   :vongdu (str staticPath "image/vongdu.jpg")
			   :xuyenkhong (str staticPath "image/xuyenkhong.jpg")
			   :icon (str staticPath "image/icon.png")
			   :facebook (str staticPath "image/facebook.png")
			   :google+ (str staticPath "image/google+.png")
			   :rss (str staticPath "image/rss.png")
			   :twitter (str staticPath "image/twitter.png")
			   :logo3 (str staticPath "image/logo3.png")
			   :font1 (str staticPath "fonts/glyphicons-halflings-regular.eot")
			   :font2 (str staticPath "fonts/glyphicons-halflings-regular.woff")
			   :font3 (str staticPath "fonts/glyphicons-halflings-regular.ttf")
			   :font4 (str staticPath "fonts/glyphicons-halflings-regular.svg")})

(defn getImageLink [ten-truyen]
	(str staticPath ten-truyen "/cover"))

