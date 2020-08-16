(ns server.start
  (:require [ring.adapter.jetty]))

;;; I want to run: clj -A:tasks
;;; to start the server
;;; similar to
;; https://github.com/ring-clojure/ring/wiki/Getting-Started

(defn -main []
  (println "task for starting server on port 3000")
  (use 'ring.adapter.jetty)
  (use 'apireport.core)
  (run-jetty apireport.core/handler {:port 3000 :join? false})
  )

;;; i get the error
;; Unable to resolve symbol: run-jetty in this context, compiling:(server/start.clj:13:3)
