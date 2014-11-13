(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://github.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371" :scope "provided"]
                 [compojure "1.2.1"]
                 [reagent "0.4.3"]]
  :source-paths ["src/clj", "src/cljs"]

  :plugins [[lein-ring "0.8.13"]]

  :ring {:handler {{name}}.handler/handler}
  
  :profiles {}
  
  :cljsbuild {:builds
              {:dev {:source-paths ["src/cljs"]
                     :compiler
                     {:preamble ["reagent/react.js"]
                      :output-to "resources/public/js/{{name}}.js"
                      :output-dir "resources/public/js/out"
                         
                      :source-map "resources/public/js/out.js.map"
                      :externs ["react/externs/react.js"]
                      :optimizations :none                      
                      :pretty-print true}}}})
