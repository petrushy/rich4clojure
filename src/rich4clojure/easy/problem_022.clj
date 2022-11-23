(ns rich4clojure.easy.problem-022
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Count a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns the total number of
;; elements in a sequence.

(def restricted [count])

(defn mycount [x]
  (reduce + (map (fn [x] (int 1)) x))
  )

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (mycount '(1 2 3 3 1)) := 5
  (mycount "Hello World") := 11
  (mycount [[1 2] [3 4] [5 6]]) := 3
  (mycount '(13)) := 1
  (mycount '(:a :b :c)) := 3)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d55eddc37d7a08a3440748ddb75c7ec4