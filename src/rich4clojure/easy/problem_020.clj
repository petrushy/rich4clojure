(ns rich4clojure.easy.problem-020
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Penultimate Element =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns the second to last
;; element from a sequence.

(def __ :tests-will-fail)

(defn f [l]
  (first (drop 1 (reverse l))))

(comment
  
  )

(tests
  (f (list 1 2 3 4 5)) := 4
  (f ["a" "b" "c"]) := "b"
  (f [[1 2] [3 4]]) := [1 2])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/bb564e188dc4d73aa37b714b64003dfe