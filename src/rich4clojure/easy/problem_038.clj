(ns rich4clojure.easy.problem-038
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Maximum value =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [core-functions]
;; 
;; Write a function which takes a variable number of
;; parameters and returns the maximum value.

(def restricted [max max-key])

(def __ :tests-will-fail)

(defn __ [& x]
  (apply max x)
  )

;; Based on internet
(defn __ [first & rest]
  (reduce #(if (>= %1 %2)
             %1
             %2)
          first rest))

(defn __ [& x]
  (last (sort x)))

(comment
  
  )

(tests
  (__ 1 8 3 4) := 8
  (__ 30 20) := 30
  (__ 45 67 11) := 67)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/3d8cce63160543ce69b40bc041174b28