(ns test
    (:use [clojure.test :only [run-tests deftest is]]))

; Very simple test
(deftest first-test []
    (is (= "this" "this")))

(run-tests)
