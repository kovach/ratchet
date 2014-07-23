(ns ratchet.core
  (:require [clojure.zip :as z])
  )

(def modes
  ['head 'env 'case-head 'name 'val]
  )
(defn init-env [program]
  {:env {}
   :focus nil
   :mode 'head
   :args '()
   :tree (z/down (z/seq-zip program))
   }
  )

(def p1
  '(Lists
    length 
    (l ask
     (case l
       Nil 0
       Cons (+ 1 (length l.tail))
       )
       )
    append
    (l1 ask
     l2 ask
     (case l1
       Nil l2
       Cons (Cons
              head l1.head
              tail (append l1.tail l2)
              )
       )
        )
    foldr
    (f var
     x var
     list var
     (case list
       Nil x
       Cons (f list.head (foldr f x list.tail))
       )
       )
    )
  )

(def p2
  '(Id
     a ask
     b a
     )
  )
(def p3
  '(
    (foldr (f x list
              (case list
                Nil x
                Cons (f (0 list.head)
                        (1 (foldr (f f)
                                  (x x)
                                  (list list.tail)))))))))

(def p4
  '(
    head (l var
          (Nil Nothing
           Cons (val l.head Just)
           l)
            )
    )
  )

