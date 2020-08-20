(ns server.start
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [request args]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str "Hello World "  args)})

(defn -main [& args]
  (println (str "task for starting server on port 3000 with args" args))
  (run-jetty #(handler % args) {:port 3000 :join? false}))
