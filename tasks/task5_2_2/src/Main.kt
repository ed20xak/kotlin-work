// Task 5.2.2: conversion of marks into grades, using a function

fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    var mark = 0

    for (n in 1..args.size) {
        mark = args[n-1].toInt()
        println("%d is a %s".format(mark, grade(mark)))
    }
}