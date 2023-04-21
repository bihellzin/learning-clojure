(defn sum-squares [numbers-array]
    (reduce + 0 (map #(* % %) numbers-array)))

(println (sum-squares [1, 2, 3, 4]))
