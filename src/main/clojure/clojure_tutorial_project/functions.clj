(ns clojure-tutorial-project.functions)

(defn func1 []
  (def x 1)
  (def y 1.25)
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1))


(defn func2 []
  ((fn [x] (* 2 x)) 2))

(defn demo1 [] (* 2 2))
(defn demo2 [x] (* 2 x))
(defn demo3 [x y] (* 2 x y))

(defn demo4
  [message & others]
  (str message (clojure.string/join " " others)))

;; HOF
(filter even? (range 0 10))

;; Recusion
(defn recursion-fn []
  (loop [i 0]
    (when (< i 5)
      (println i)
      (recur (inc i)))))