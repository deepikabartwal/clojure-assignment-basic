(ns assignment)

(defn is-even [number] (= (rem number 2) 0))

(defn is-odd? [number] (not (is-even number)))
