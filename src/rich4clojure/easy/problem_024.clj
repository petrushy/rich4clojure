(ns rich4clojure.easy.problem-024
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sum It All Up =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns the sum of a sequence of
;; numbers.

(def __ :tests-will-fail)

(defn mysum [x]
  (reduce + 0 x))                                           ;; for each add to the 0

(comment

  )

(tests
  (mysum [1 2 3]) := 6
  (mysum (list 0 -2 5 5)) := 8
  (mysum #{4 2 1}) := 7
  (mysum '(0 0 -1)) := -1
  (mysum '(1 10 3)) := 14)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/feb88ed305b672c9897330561da6b331