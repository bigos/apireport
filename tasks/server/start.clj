(ns server.start)

;;; I want to run: clj -A:tasks
;;; to start the server
;;; similar to
;; https://github.com/ring-clojure/ring/wiki/Getting-Started

(defn -main []
  (println "task for starting server on port 3000")
  (use 'ring.adapter.jetty)
  (use 'apireport.core)
  (run-jetty apireport.core/handler {:port 3000 :join? false}))
