(ns clojure-tutorial-project.loops)

;; This example is used for loops
(defn example-loops []
  (def x (atom 1))

  (while ( < @x 5 )
    (do
      (println @x)
      (swap! x inc)))

  (doseq [n [0 1 2]]
    (println n))

  (dotimes [n 5]
    (println n))

  (loop [n 10]
    (when (> n 1)
      (println n)
      (recur (- n 2)))))