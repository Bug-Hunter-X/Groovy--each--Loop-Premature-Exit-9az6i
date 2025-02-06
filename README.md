# Groovy 'each' Loop Premature Exit Bug

This repository demonstrates a common, yet subtle, error in Groovy: the unexpected behavior of `return` within an `each` loop.  The `return` statement will exit the `each` loop, not the method, leading to incomplete processing of the collection.

## Bug Description

The `myMethod` function iterates over a list of strings. If a `null` element is encountered, it prints a message and uses `return` to seemingly exit the method. However, only the loop terminates; the function continues execution.