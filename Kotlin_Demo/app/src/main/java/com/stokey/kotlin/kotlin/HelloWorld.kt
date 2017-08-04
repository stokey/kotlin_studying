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

open class A {
    open fun f(){print("A")}
    fun a() {print("a")}
}

interface B {
    // 接口中成员默认为open
    fun f(){print("B")}
    fun b(){print("b")}
}

open class C {
    open fun f(){print("C")}
    fun c(){print("c")}
}

class D(): A(),B{
    // 编译器要求覆盖f()
    override fun f() {
        super<B>.f()
        super<A>.f()
    }

    override fun b() {
        super.b()
    }

}

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr:Expr):Double = when(expr){
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}