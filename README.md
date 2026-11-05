# Pure Scala FP — from collections to higher-order functions

Scala 3.10.0, no library: just the standard collections and functions. About **2 hours**.

## How it works

Each `src/main/scala/fp/ExNN*.scala` file contains functions whose body is `???`.
Replace each `???` with an implementation until the matching test suite is green.
Each part starts with a solved example.

```bash
sbt "~testOnly fp.Ex01*"   # re-runs the Part 1 tests on every save
sbt console                # REPL: try `fp.Data.students`
```

Tests are independent: if you are stuck, move on and come back later.
⭐ exercises are bonuses for those who finish early.

## Plan

| Part | File | Time | Topics |
|------|------|------|--------|
| 0 | `Ex00Warmup` | 5' | setup, first function |
| 1 | `Ex01Collections` | 15' | `List`, `Vector`, `Set`, `Map`, `Option` |
| 2 | `Ex02Transformations` | 20' | `map`, `filter`, `flatMap`, `collect`, `for` |
| 3 | `Ex03Aggregations` | 20' | `foldLeft`, `groupBy`, `groupMapReduce`, `partition`, `sortBy`, `sliding` |
| 4 | `Ex04Recursion` | 15' | pattern matching on lists, `@tailrec` |
| 5 | `Ex05Functions` | 10' | functions as values, lambdas, eta-expansion |
| 6 | `Ex06HigherOrder` | 20' | writing HOFs: `myMap`, `compose`, `curry`, ... |
| 7 | `Ex07Capstone` | 15' | CSV → report pipeline |

The shared dataset (students, a text, CSV lines) is in `Data.scala`.

## Rules

- No `var`, no `while`, no `return`, no mutable collections.
- Part 4: no library collection methods, only pattern matching and recursion.
- Part 6: no built-in `map` / `filter` / `foldLeft` / `exists` / `flatMap` inside the extension methods.
