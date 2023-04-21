(defn high-order-calculator [function-operation x y]
    (function-operation x y))

(defn add [x y]
    (+ x y))

(defn multiply [x y]
    (* x y))

(defn subtract [x y]
    (- x y))

(println (high-order-calculator add 10 20)) ;; 30
(println (high-order-calculator subtract 10 20)) ;; -10
(println (high-order-calculator multiply 10 20)) ;; 200
