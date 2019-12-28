(ns assignment)

(defn is-even [number] (= (rem number 2) 0))

(defn is-odd? [number] (not (is-even number)))

(defn square [number] (* number number))

(defn cube [number] (* number number number))

(defn find-greatest-of-three-numbers [firstNumber secondNumber thirdNumber] (max firstNumber secondNumber thirdNumber))