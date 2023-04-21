(require '[clojure.string :as str])

(defn palindrome? [string]
    (= (str/reverse string) string))

(println (palindrome? "abc")) ;; false
(println (palindrome? "aba")) ;; true
