(ns rich4clojure.easy.problem-028
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which flattens a sequence.

(def restricted [flatten])

(def __ :tests-will-fail)

;; TODO, I don't understand why this isn't working.

(defn myflatten [x]
  (if (sequential? x)
    (apply concat (map myflatten x))
    [x]))

#dbg (defn myflatten [x]
  (if (sequential? x)
    (mapcat myflatten x)
    [x]))


(tests
 (myflatten '((1 2) 3 [4 [5 6]])) := '(1 2 3 4 5 6)
 
 (myflatten ["a" ["b"] "c"]) := '("a" "b" "c")
 (myflatten '((((:a))))) := '(:a))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0c6e3c48cac7434882ca4b2c71ebfce1