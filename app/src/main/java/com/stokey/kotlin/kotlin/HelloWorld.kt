package com.stokey.kotlin.kotlin

/**
 * Created by stokey on 2017/5/24.
 */

// 接受两个int类型参数，返回值为int
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 自动推导型的返回值
fun sum1(a: Int, b: Int) = a + b

// 返回一个没有意义的值
fun printSum(a:Int,b:Int):Unit{
    println("sum of $a and $b is ${a+b}")
}

// Unit的返回类型可以省略
fun printSum2(a:Int,b:Int){
    println("sum of $a and $b is ${a+b}")
}

fun main(args:Array<String>){
    print("sum of 3 and 5 is ")
    println(sum(3,5))

    printSum(10,2)

    // 常量
    val a:Int = 1 // 立即初始化
    val b =2 // 推导出Int型

    // 变量
    var x = 5
}