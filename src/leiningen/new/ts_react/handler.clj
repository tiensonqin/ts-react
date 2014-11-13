(ns {{name}}.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]))

(defroutes app-routes
  (GET "/" []
       (resp/resource-response "index.html" {:root "public"}))
  (route/resources "/")
  (route/not-found "Page not found"))

(def handler
  (handler/site app-routes))
