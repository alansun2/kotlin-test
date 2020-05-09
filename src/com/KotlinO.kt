package com

object KotlinO {
    fun test(){
        val items = listOf("1", "2", "sdf")
        var i = 0
        while (items.size > i){
            println("item$i = ${items[i]}" + "df")
            i++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        test()
        var d = MainTest()
    }
}