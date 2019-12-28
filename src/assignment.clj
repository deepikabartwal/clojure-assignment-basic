(ns assignment)

(defn is-even [number] (= (rem number 2) 0))

(defn is-odd? [number] (not (is-even number)))

(defn square [number] (* number number))

(defn cube [number] (* number number number))

(defn find-greatest-of-three-numbers [firstNumber secondNumber thirdNumber] (max firstNumber secondNumber thirdNumber))

(defn get-average-of-three-numbers [firstNum secondNum thirdNum] (float (/ ( + firstNum secondNum thirdNum) 3)))

(defn sum-of-n-numbers [limit] (/ (* limit (inc limit)) 2))

(println (sum-of-n-numbers 100))