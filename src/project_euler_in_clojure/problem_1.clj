(ns project-euler-in-clojure.problem-1)

(defn problem1 [] (reduce + (set (concat (range 0 1000 3) (range 0 1000 5)))))
