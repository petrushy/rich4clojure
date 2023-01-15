(ns rich4clojure.easy.problem-034
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Implement range =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which creates a list of all integers
;; in a given range.

(def restricted [range])

(def __ :tests-will-fail)



(defn __ 
  [n1 n2]
  (if (< n1 n2)
    (cons n1 (__ (inc n1) n2))
    []) ;; not including last
)

(defn __ 
  [n1 n2]
  (->> n1
       (iterate inc)
       (take (- n2 n1))))

(def __ #(loop [a %1
                b %2
                res []] 
           (if (< a b) 
             (recur (inc a) b (conj res a)) 
             res)))

(comment
  
  )

(tests
  (__ 1 4) := '(1 2 3)
  (__ -2 2) := '(-2 -1 0 1)
  (__ 5 8) := '(5 6 7))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6ebd843c6422d507efa327bee4bf0b50