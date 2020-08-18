(ns tallex.main_page
  (:require
    [goog.dom :as gdom]))

(defn add_to_list []
  (js/console.log "working")
  )

  (def input (gdom/getElement "new_item"))
  ;esse console retorna o elemento html input
  ;(js/console.log input)
  


(defn app []

[:main.container
  [:h1.site_title "Time Dive"]
  [:h2.app_title "Todo List"]

  [:form.add_item
    [:input#new_item 
      {:type "text" 
      :placeholder "what needs to be done?"}]
    [:input.button 
      {:type "submit"
      :value "Add"
      :on-click #(add_to_list)}]]

  [:div.items_list]])