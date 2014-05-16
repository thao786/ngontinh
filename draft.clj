(defn render-text2
	"render text, remove temp ns right after"
	[text params]
	(let 	[temp-ns 	(gensym "sodahead")
			temp-ns-str 	(str "(ns " temp-ns ")\n")
			load-str 	(str temp-ns-str (r/gen-ns-file text))
			]
		load-str))
