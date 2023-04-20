(require '[clojure.string :as str])

(defn reverse-string-recursive [string]
    (if (= (count string) 0)
        ""
        (str (str (get string (dec (count string)))) (reverse-string-recursive (subs string 0 (dec (count string)))))))

(defn reverse-string [string]
    (str/reverse string))
