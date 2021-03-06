(defproject ngontinh "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.7"]
                 [org.apache.commons/commons-pool2 "2.2"]
                  [redis.clients/jedis "2.4.2"]
                  [org.postgresql/postgresql "9.3-1101-jdbc41"]
                  [org.clojure/core.cache "0.6.3"]
                  [cheshire "5.3.1"]
                  [org.clojure/tools.trace "0.7.5"]
                  [org.apache.lucene/lucene-core "4.8.1"]
                  [org.apache.lucene/lucene-analyzers-common "4.8.1"]
                  [org.apache.lucene/lucene-queryparser "4.8.1"]
                  [org.xerial/sqlite-jdbc "3.8.7"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler ngontinh.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
