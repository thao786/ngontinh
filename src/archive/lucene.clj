(import 'java.io.File)
(import 'org.apache.lucene.analysis.Analyzer)
(import 'org.apache.lucene.analysis.standard.StandardAnalyzer)
(import 'org.apache.lucene.document.Document)
(import 'org.apache.lucene.document.Field)
(import 'org.apache.lucene.document.TextField)
(import 'org.apache.lucene.index.IndexWriter)
(import 'org.apache.lucene.index.IndexWriterConfig)
(import 'org.apache.lucene.queryparser.classic.ParseException)
(import 'org.apache.lucene.queryparser.classic.QueryParser)
(import 'org.apache.lucene.store.Directory)
(import 'org.apache.lucene.store.FSDirectory)
(import 'org.apache.lucene.util.Version)
(import 'org.apache.lucene.index.DirectoryReader)
(import 'org.apache.lucene.queryparser.classic.ParseException)
(import 'org.apache.lucene.queryparser.classic.QueryParser)
(import 'org.apache.lucene.search.IndexSearcher)
(import 'org.apache.lucene.search.Query)
(import 'org.apache.lucene.search.ScoreDoc)

(import ')

(def analyzer (StandardAnalyzer. Version/LUCENE_CURRENT))
(def direc (File. "/home/thao/storage"))
(def directory (FSDirectory/open direc))




;index files
(def config (IndexWriterConfig. Version/LUCENE_CURRENT analyzer))
(def iwriter (IndexWriter. directory config))
(def docu (Document.))
(def text (slurp "/home/thao/Truyen218/419/1.txt"))
(.add docu (Field. "content" text TextField/TYPE_STORED))
(.addDocument iwriter docu)
(.close iwriter)




;search files
(def ireader (DirectoryReader/open directory))
(def isearcher (IndexSearcher. ireader))
(def parser (QueryParser. Version/LUCENE_CURRENT "content" analyzer))
(def query (.parse parser "cáo quan trọng"))
(def hits (.scoreDocs (.search isearcher query nil 1000)))
(count hits)
(.close ireader)
(.close directory)





;185 vs 228 index every file
(def config (IndexWriterConfig. Version/LUCENE_CURRENT analyzer))
(def iwriter (IndexWriter. directory config))
(doseq [folder (.listFiles (File. "/home/thao/Truyen218"))]
	(doseq [file (.listFiles (File. (.getPath folder)))]
		(let [namef 	(.getName file)]
			(if (.matches namef ".*.txt")
				(let [docu (Document.)
						text (slurp file)
						dummy 	(.add docu (Field. "content" text TextField/TYPE_STORED))
						dummy 	(.addDocument iwriter docu)]
					(prn dummy))
				nil))))
(.close iwriter)











