(ns hello-world.core
  (:gen-class)
  (:require [hello-world.handler :refer [app]])
  (:use org.httpkit.server))

(defonce server (atom nil))

(defn -main [msg & args]
  (reset! server (run-server (app msg) {:port 80})))
