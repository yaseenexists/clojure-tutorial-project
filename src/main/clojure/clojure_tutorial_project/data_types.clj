(ns clojure-tutorial-project.data-types)

;; This example is used for data-types
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
