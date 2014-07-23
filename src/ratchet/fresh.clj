(ns ratchet.fresh)

(comment
  demands

  build trees
  reference parts of trees
  fail
  stack-cells (sc)

  evaluation tree
  state sc?
  what is program?

    program/data are the same, 
    but program span is read in reverse




  (basic values
    symbol (textual token)  
    label tree
    span (mutable value)
    )

  syntax idea
   distinguish between "Reference" and "set/push" by color?
     or, say, upper/lower case
     starting from {}, Foo bar will produce {foo bar}
     reading from empty span produces failure
       what is reading?
       how to represent two contexts?
        from/to?
       . {1 {x 0 y 0} 2 {}}
        try
         {from (1 x) to (2 x)
          from (1 y) to (2 y)
          }

  )

