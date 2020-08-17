(ns server.start
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [apireport.core]))

(defn -main []
  (println "task for starting server on port 3000")
  (run-jetty apireport.core/handler {:port 3000 :join? false}))
