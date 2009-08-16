(ns webapp
  (:gen-class :extends javax.servlet.http.HttpServlet)

  (:use clojure.contrib.json.write)
  (:use clojure.contrib.duck-streams)
  (:use compojure.control)
  (:use compojure.html.gen)
  (:use compojure.html.page-helpers)
  (:use compojure.html.form-helpers)
  (:use compojure.http.helpers)
  (:use compojure.http.multipart)
  (:use compojure.http.routes)
  (:use compojure.http.servlet)
  (:use compojure.http.session)
  (:use compojure.map-utils)
  (:use compojure.validation))

(defroutes example-app

  (GET "/"
    (html [:h1 "Hello World"])))


(defservice example-app)

