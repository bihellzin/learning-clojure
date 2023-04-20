(defn fizzbuzz
    [num]
    (cond
        (= 0 (mod num 15)) "FizzBuzz"
        (= 0 (mod num 3)) "Fizz"
        (= 0 (mod num 5)) "Buzz"
        :else num))
