(ns sodahead.render
	(:require 	[clojure.java.io :as io]
				[sodahead.parse :as p]
				[sodahead.prep :as pe]))
<<<<<<< HEAD
=======
;(remove-ns 'sodahead)
>>>>>>> 3cddc4ec1cee0a8f81bed52a1a173e7a6496f02f

(def ns-list (atom {}))

(defn bloc-or-expr
	"return true if this chunk is a block or expression"
	[chunks chunk]
	(let [type (chunk :type)]
		(cond 
			(= type "bloc") (.indexOf chunks chunk)
			(= type "expr") (.indexOf chunks chunk)
			:else false)))

(defn gen-ns-file
<<<<<<< HEAD
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
	(if (@ns-list rkey)
		(@ns-list rkey)
		;create a namespace and push it in list
		(let 	[new-ns 	(gensym "sodahead")
				load-str 	(gen-ns-file text new-ns)
				dummy 	(swap! ns-list assoc rkey new-ns)
				dummy 	(load-string load-str)]
			new-ns)))

=======
	"return a loadable body string preceded by the require block"
	[original-text]
	(let 	[chunks 	(-> original-text (pe/get-included) (p/chop))
			ns-block-index 	(some (partial bloc-or-expr chunks) chunks)
			ns-block 	(get chunks ns-block-index)
			ns-block-content (str (pe/morph-into-code ns-block) "\n")
			body-chunks 	(remove #(= ns-block-index (.indexOf chunks %)) chunks)
			code-vector 	(map pe/morph-into-code body-chunks)
			body-code 	(pe/wrap-do code-vector)
			body-str 	(str ns-block-content body-code)]
		body-str))

>>>>>>> 3cddc4ec1cee0a8f81bed52a1a173e7a6496f02f
(defn render-text
	"render text, remove temp ns right after"
	[text params]
	(let 	[temp-ns 	(gensym "sodahead")
<<<<<<< HEAD
			load-str 	(gen-ns-file text temp-ns)
=======
			temp-ns-str 	(str "(ns " temp-ns ")\n")
			load-str 	(str temp-ns-str (gen-ns-file text))
>>>>>>> 3cddc4ec1cee0a8f81bed52a1a173e7a6496f02f
			dummy 	(load-string load-str)
			result 	(load-string (str "(" temp-ns "/render " params ")"))
			dummy 	(remove-ns temp-ns)]
		result))

<<<<<<< HEAD
(defn render-file
	([file-path]
		(render-file file-path {}))
	([file-path params]
		(render-text (slurp (io/resource file-path)) params)))

(defn render-key 
	([rkey] (render-key rkey {}))

	([rkey params]
	(if-let [name-ns 	(@ns-list rkey)]
		(let [load-str 	(str "(" name-ns "/render " params ")")]
			(load-string load-str))
		nil)))

(def render render-file)
=======
(defn render
	[file-path]
	(render file-path {})

	[file-path params]
	(if-let [file-ns (get ns-list file-path)]
		(load-string "(file-ns/render params)")
		(render-text (slurp file-path) params)))

>>>>>>> 3cddc4ec1cee0a8f81bed52a1a173e7a6496f02f

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