(ns clojure-tutorial-project.conditionals)

;; This example is used to demonstrate conditional statements
(defn example-conditionals []

  ;; if conditional
  (if ( = 2 2)
    (println "Values are equal")
    (println "Values are not equal"))

  ;; if/do conditional
  (if (= 2 2)
    (do (println "Both the values are equal")
        (println "true"))
    (do (println "Both the values are not equal")
        (println "false")))

  ;; case conditional
  (def x 5)
  (case x 5 (println "x is 5")
          10 (println "x is 10")
          (println "x is neither 5 nor 10"))

  ;; cond conditional
  (cond
    (= x 5) (println "x is 5")
    (= x 10)(println "x is 10")
    :else (println "x is not defined")))