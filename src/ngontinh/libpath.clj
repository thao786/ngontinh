(ns ngontinh.libpath
	(:require 	[clojure.java.io :as io]))

; (def hostPath "http://50.116.53.36:8080/")
(def hostPath "http://trangngontinh.com/")
(def local-file-path "/home/thao/ngontinh/resources/static/")
; (def hostPath "http://localhost:3000/")
; (def local-file-path "C:/Users/Thuy/Desktop/git/ngontinh/resources/static/")

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
				"codai" "c" 
				"congso" "công sở" 
				"cungdau" "cung" 
				"cungdinh" "cung đình" 
				"dammy" "m m" 
				"doanvan" "đoản văn" 
				"dongnhan" "đồng nhân" 
				"dienvan" "điền văn" 
				"giangho" "giang" 
				"hai" "h├ái" 
				"hacbang" "hắc bang" 
				"hiendai" "hi" 
				"hoanthan" "hoán thân" 
				"huyenhuyen" "huy" 
				"kiemhiep" "kiếm hiệp"
				"nguoc" "ng" 
				"nhanthu" "nhân thú" 
				"nuton" "nữ tôn" 
				"nuphannamtrang" "nữ phẫn nam trang" 
				"np" "np" 
				"phuchacnam" "phúc hắc nam" 
				"quannhan" "quân nhân" 
				"sac" "s" 
				"sung" "sủng" 
				"sudoluyen" "sư đồ luyến"
				"hocduong" "học đường" 
				"tienhiep" "tiên hiệp" 
				"trongsinh" "sinh" 
				"vongdu" "du" 
				"xuyenkhong" "xuy" 
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
