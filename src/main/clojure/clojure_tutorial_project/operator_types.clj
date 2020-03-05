(ns clojure-tutorial-project.operator-types)

;; This example is used to demonstrate operator-types
(defn example-operators []
  ;; The below code uses Arithmetic Operators
  (def a (+ 2 2))

  (def b (- 2 1))

  (def c (* 2 2))

  (def d (float(/ 2 1)))

  (def e (inc 2))

  (def f (dec 2))

  (def g (max 1 2 3))

  (def h (min 1 2 3))

  (def i (rem 3 2))

  ;; The below code uses Relational Operators
  (def j (= 2 2))

  (def k (not= 3 2))

  (def l (< 2 3))

  (def m (<= 2 3))

  (def n (> 3 2))

  (def o (>= 3 2))

  ;; The below code uses Logical Operators
  (def x (or true true))

  (def x (and true false))

  (def x (not true))

  ;; The below code uses Bitwise Operators
  (def x (bit-and 00111100 00001101))

  (def x (bit-or 00111100 00001101))

  (def x (bit-xor 00111100 00001101)))
