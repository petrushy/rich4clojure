(ns rich4clojure.easy.problem-027
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Palindrome Detector =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns true if the given
;; sequence is a palindrome.
;; 
;; 
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(def __ :tests-will-fail)

(defn __ [x]
  (= x (reverse x)))

(comment)

;; chatGPT version
(defn palindrome? [x]
  (let [n (count x)]
    (reduce
     (fn [acc i]
       (and acc (=  ;; true as a start and fail if not eq
                 (nth x i)
                 (nth x (- n i 1)))))
     true
     (range (quot n 2)))))


(tests
 (__ '(1 2 3 4 5)) :=
 (__ "racecar") :=
 (__ [:foo :bar :foo]) :=
 (__ '(1 1 3 3 1 1)) :=
 (__ '(:a :b :c)) :=)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a9620760aad9da40c497f5750087a095