(ns rich4clojure.easy.problem-021
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Nth Element =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns the Nth element from a
;; sequence.

(def restricted [nth])

(defn mynth
  [x n]
  (->> x
      (drop n) 
       (first)
      ))

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (mynth '(4 5 6 7) 2) := 6
  (mynth [:a :b :c] 0) := :a
  (mynth [1 2 3 4] 1) := 2
  (mynth '([1 2] [3 4] [5 6]) 2) := [5 6])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/327178a78d8d0b021a72c75b0876a225