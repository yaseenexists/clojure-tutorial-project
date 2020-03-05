(ns clojure-tutorial-project.data-types)

;; This example is used to demonstrate data-types
(defn example-data-types []
  ;; The below code declares a integer variable
  (def x 1)

  ;; The below code declares a float variable
  (def y 1.25)

  ;; The below code declares a string variable
  (def str1 "Hello")

  ;; The below code declares a boolean variable
  (def bool false)

  ;; The below code declares a nil variable
  (def nil1 nil)

  ;; The below code declares an atom variable
  (def atom1 (atom "example"))

  (println x)
  (println y)
  (println str1)
  (println bool)
  (println nil1)
  (println @atom1))

(defn number-functions []

  (def x1 (zero? 0.0))
  (def x2 (pos? 0))
  (def x3 (neg? -1))
  (def x4 (even? 2))
  (def x5 (odd? 3))
  (def x6 (number? 4.0))
  (def x7 (integer? 5))
  (def x8 (float? 6.0)))
