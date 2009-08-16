(ns run
  (:use compojure)
  (:use webapp))

(run-server {:port 8080} "/*" (servlet example-app))
