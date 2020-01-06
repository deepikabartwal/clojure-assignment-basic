(ns assignment)

(defn is-even [number] (= (rem number 2) 0))

(defn is-odd? [number] (not (is-even number)))

(defn square [number] (* number number))

(defn cube [number] (* number number number))

(defn find-greatest-of-three-numbers [firstNumber secondNumber thirdNumber] (max firstNumber secondNumber thirdNumber))

(defn get-average-of-three-numbers [firstNum secondNum thirdNum] (float (/ (+ firstNum secondNum thirdNum) 3)))

(defn sum-of-n-numbers [limit] (/ (* limit (inc limit)) 2))

(defn get-gcd [num1 num2]
  ( loop [ divisor (min num1 num2)
          dividend (max num1 num2)]
    (if (zero? divisor)
      dividend
      (recur (rem dividend divisor) divisor)
      )
    )
  )

(defn get-lcm [num1 num2] (/ (* num1 num2) (get-gcd num1 num2)))

(defn calculate-simple-interest [principle rate time-period] (/ (* principle rate time-period) 100))

(defn calculate-compound-interest [principle rate time-period] (- (* principle (Math/pow (+ 1 (/ rate 100)) time-period)) principle))

(defn convert-fahrenheit-to-celsius [temperature-in-fahrenheit] (* (- temperature-in-fahrenheit 32) (/ 5 9.0)) )

(defn convert-celsius-to-fahrenheit [temperature-in-celsius] (+ (* temperature-in-celsius (/ 9 5.0)) 32))

(println (sum-of-n-numbers 100))