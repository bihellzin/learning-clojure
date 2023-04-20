
(defn valor-total
    [valor]
    (let [percentual-multa 0.1
          valor-multa (* valor percentual-multa)]
        (+ valor valor-multa)))

(defn calcula-imposto
    [salario]
    (if (<= salario 1000)
    0
    (if (< salario 2000)
        (* salario 0.1)
        (* salario 0.2))))

(defn maior-de-idade?
    [idade]
    (if (>= idade 18)
        true
        false))

