(ns hello-world.core
  (:require [hello-world.handler :refer [app]])
  (:use org.httpkit.server))

(defonce server (atom nil))

(defn -main [& args]
  (reset! server (run-server #'app {:port 4321})))
