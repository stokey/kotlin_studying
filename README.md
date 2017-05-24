# Kotlin

## 学习目标
+ [ ] 基本语法
+ [ ] Kotlin + Java
+ [ ] Kotlin + Android

## 基本语法
+ 定义函数

```kotlin
// 接收两个int型参数，返回值为int
fun sum(a:Int,b:Int):Int{
    return a+b
}
// 自动推导的返回值
fun sum2(a:Int,b:Int) = a+b

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

    println("sum of 19 and 23 is ${sum2(19,23)}")

    printSum(28,12)
}
```

+ 定义局部变量
	+ 常量：`val a: Int = 1`
	+ 变量 ：`var x = 5`

+ 注释：`同Java，单行——//，多行——/* */`
+ 字符串模版：`$，类似JS`
+ if可以当作表达式：`fun maxOf(a:Int,b:Int)=if (a>b) a else b` 
+ 使用可空变量以及空值检查	
