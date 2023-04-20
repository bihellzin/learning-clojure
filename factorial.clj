(defn factorial [n]
    (if (= n 1)
        1
        (* n (factorial (- n 1)))))

(defn factorial-reduce [n]
    (reduce * 1 (range 1 (+ n 1))))
