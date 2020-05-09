package com

class MainTest {
    fun main(args: Array<String>) {
        println("hello world!")
        println(sum(1, 4))
        println(sum1(1, 4))
        println(printSum(1, 4))
        val people = People("3", 1)
        val age = people.age
        KotlinO.test()
        print(age)
    }

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    private fun sum1(a: Int, b: Int) = a + b


    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    class People {
        constructor(name: String, age: Int) {
            this.name = name
            this.age = age
        }

        var name: String
        var age: Int
    }
}
