(ns leiningen.new.ts-react
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "ts-react"))

(defn ts-react [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["resources/templates/index.html" (render "index.html" data)]
             ["src/clj/{{sanitized}}/handler.clj" (render "handler.clj" data)]
             ["src/clj/{{sanitized}}/user.clj" (render "user.clj" data)]
             ["src/cljs/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["src/cljs/{{sanitized}}/connect.cljs" (render "connect.cljs" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["README.md" (render "README.md" data)]
             [".gitignore" (render "gitignore" data)])))
