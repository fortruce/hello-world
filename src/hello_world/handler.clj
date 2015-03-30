(ns hello-world.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn msg-routes
  [msg]
  (routes
       (GET "/" [] msg)
       (route/not-found "Not Found")))

(defn app
  [msg]
  (-> msg
      msg-routes
      (wrap-defaults site-defaults)))
