(defproject ngontinh "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [org.apache.commons/commons-pool2 "2.2"]
                  [redis.clients/jedis "2.4.2"]
                  [org.postgresql/postgresql "9.3-1101-jdbc41"]
                  [org.clojure/java.jdbc "0.3.3"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler ngontinh.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
