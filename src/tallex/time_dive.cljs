(ns ^:figwheel-hooks tallex.time-dive
  (:require
    [reagent.core :as r]
    [tallex.main_page :as t.main]))


(defn mount []
  (reagent.dom/render [t.main/app] (js/document.getElementById "root")))


(defn ^:after-load re-render []
  (mount))


(defonce start-up (do (mount) true))
