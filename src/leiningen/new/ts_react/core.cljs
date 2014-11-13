(ns {{name}}.core
  (:require [reagent.core :as reagent :refer [atom]]))

(defn page []
  [:div
   [:h1 "Hello World!"]])

(reagent/render-component [page]
                          (.-body js/document))
