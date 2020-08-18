(ns ^:figwheel-hooks tallex.time-dive
  (:require
    [reagent.core :as r]))


(defn app []
  [:h1.site__title
    [:span.site__title-text "Time Dive Todo List"]])


(defn mount []
  (reagent.dom/render [app] (js/document.getElementById "root")))


(defn ^:after-load re-render []
  (mount))


(defonce start-up (do (mount) true))
