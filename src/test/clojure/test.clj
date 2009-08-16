(ns test
    (:use [clojure.test :only [run-tests deftest is]])
    (:use compojure)
    (:use webapp)
    (:require [clojure.http.resourcefully :as resourcefully]))

; Very simple test
(deftest first-test []
    (is (= "this" "this")))


; Add some automated tests for our web app
; Start by declaring and starting the server

(def *JETTY* (jetty-server {:port 8080} "/*" (servlet example-app)))
(.start *JETTY*)

(deftest compojure-test []
  (let [response (resourcefully/get "http://localhost:8080/")]
    (is (= (:code response) 200))))

(run-tests)

; And stop the server...
(.stop *JETTY*)
