(ns sodahead.render
	(:require 	[clojure.java.io :as io]
				[sodahead.parse :as p]
				[sodahead.prep :as pe]
				[sodahead.cache :as c]))

(defn bloc-or-expr
	"return true if this chunk is a block or expression"
	[chunks chunk]
	(let [type (chunk :type)]
		(cond 
			(= type "bloc") (.indexOf chunks chunk)
			(= type "expr") (.indexOf chunks chunk)
			:else false)))

(defn gen-ns-file
	"return a loadable body string preceded by the require and ns block"
	[text new-ns]
	(let 	[chunks 	(-> text (pe/get-included) (p/chop))
			require-block-index 	(some (partial bloc-or-expr chunks) chunks)
			require-block 	(get chunks require-block-index)
			require-block-content (str (pe/morph-into-code require-block) "\n")
			body-chunks 	(remove #(= require-block-index (.indexOf chunks %)) chunks)
			code-vector 	(map pe/morph-into-code body-chunks)
			body-code 	(pe/wrap-do code-vector)
			ns-expr 	(str "(ns " new-ns ")\n")
			body-str 	(str ns-expr require-block-content body-code)]
		body-str))

(defn cache [rkey text]
	(if (c/ns-list rkey)
		nil
		;create a namespace and push it in list
		(let 	[new-ns 	(gensym "sodahead")
				load-str 	(gen-ns-file text new-ns)
				]
			new-ns)))

(defn render-text
	"render text, remove temp ns right after"
	[text params]
	(let 	[temp-ns 	(gensym "sodahead")
			load-str 	(gen-ns-file text temp-ns)
			dummy 	(load-string load-str)
			result 	(load-string (str "(" temp-ns "/render " params ")"))
			dummy 	(remove-ns temp-ns)]
		result))

(defn render-file
	([file-path]
		(render-file file-path {}))
	([file-path params]
		(render-text (slurp file-path) params)))

(defn render-key [rkey params]
	(if-let [name-ns 	(c/ns-list rkey)]
		(let [load-str 	(str "(" name-ns "/render " params ")")]
			(load-string load-str))
		nil))

(def render render-file)

(defmacro ig 
	"comment macro"
	[& expr] 
	nil)

(ig
(require 	'[clojure.java.io :as io]
			'[sodahead.parse :as p]
			'[sodahead.prep :as pe]
			'[sodahead.render :as r])

)