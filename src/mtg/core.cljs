(ns ^:figwheel-hooks mtg.core
    (:require [reagent.dom :as r.dom]))
  
(defn app []
  [:h1
   [:span "Hello my love"]])  

(defn mount []
  (r.dom/render [app] (js/document.getElementById "root")))
  
(defn ^:after-load re-render []
  (mount))

(defonce start-up (do (mount) true))
