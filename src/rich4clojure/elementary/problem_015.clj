(ns rich4clojure.elementary.problem-015
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Double Down =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Write a function which doubles a number.

(def __ :tests-will-fail)

(comment
  
  )

(def doubleit (fn doubleit [x] (* 2 x))
)

(tests
  (doubleit 2) := 4
  (doubleit 3) := 6
  (doubleit 11) := 22
  (doubleit 7) := 14)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b00355c5b51c4e29e27a09b6ed2f7a73