(ns ngontinh.libpath
	(:require 	[clojure.java.io :as io]))

(def hostPath "http://localhost:3000/")


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
				"oe" "OE"
				"classical" "Classical"
				"fairytale" "Fairy Tales"})

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
				"oe" "oe"
				"classical" "classical"
				"fairytale" "fairy tales"})

(defn getImageCover
	([ten-truyen lang]
		(if (= lang "v")
			(getImageCover ten-truyen)
			(str hostPath "static/Stories/" ten-truyen "/cover.jpg")))
	([ten-truyen]
		(str hostPath "static/Truyen/" ten-truyen "/cover.jpg")))


(defn getFileLink [ipath] 
	(str hostPath "static/" ipath))
