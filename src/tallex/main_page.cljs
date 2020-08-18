(ns tallex.main_page)

(defn add_to_list []
  )

(defn app []

[:main.container
  [:h1.site_title "Time Dive"]
  [:h2.app_title "Todo List"]

  [:form.add_item
    [:input.new_item 
      {:type "text" :placeholder "title"}]
    [:input.button 
      {:type "submit"}]]

  [:div.items_list]])