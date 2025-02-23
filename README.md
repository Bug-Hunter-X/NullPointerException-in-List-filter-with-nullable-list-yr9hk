# Kotlin Nullable List Filtering and NullPointerException
This example demonstrates a common error when working with nullable lists and the `filter` function in Kotlin.  A `NullPointerException` can occur if the list itself is null before the filtering operation.

The `bug.kt` file contains code that reproduces this error. The `bugSolution.kt` file provides a corrected version that prevents the exception.

The issue stems from the way the safe call operator `?.` interacts with null values. While it prevents `NullPointerException` during the `filter` operation if elements in the list are null, it doesn't prevent it if the list itself is null.