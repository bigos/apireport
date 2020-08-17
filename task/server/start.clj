(ns server.start
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [apireport.core :refer [handler]]))

(defn -main [& args]
  (println (str "task for starting server on port 3000 with args" args))
  (run-jetty handler {:port 3000 :join? false}))
