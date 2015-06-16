(defproject project-euler-in-clojure "0.1.0-SNAPSHOT"
  :description "Project Euler problems in Clojure"
  :url "https://github.com/ryanwaudby/project-euler-in-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot project-euler-in-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
