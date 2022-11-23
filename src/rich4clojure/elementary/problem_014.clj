(ns rich4clojure.elementary.problem-014
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Functions =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Clojure has many different ways to create functions.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  8 := ((fn add-five [x] (+ x 5)) 3)
  8 := ((fn [x] (+ x 5)) 3)
  8 := (#(+ % 5) 3)
  8 := ((partial + 5) 3))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/08da0019981a566de6550e692c959a24