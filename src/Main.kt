package demo

fun main(args: Array<String>) {
    println("Hello World")

//     TODO: var vs. val
    val number = 10
    var age = 3

//    TODO: If statement example
//    if (age < 5) {
//        println("Go to Preschool")
//    } else if (age == 5) {
//        println("Go to Kindergardern")
//    } else if ((age > 5) && (age <= 17)) {
//        val grade = age - 5
//        println("Go to Grade $grade")
//    } else {
//        println("Go to College")
//    }

//    TODO: When loop
//    when (age) {
//        in 0..4 -> println("Go to preschool")
//        5 -> println("Go to Kindergarden")
//        in 6..17 -> {
//            val grade = age - 5
//            println("Go to $grade")
//        } else -> println("Go to College")
//    }


//    TODO: Standard Kotlin For loop
//    for(x in 1..10) {
//        println("Loop : $x")
//    }
//
//    // Using Random class from Java
//    val rand = Random()
//    val MagicNum = rand.nextInt(50) + 1
//    var guess = 0
//
//    // While loop implementation
//    while (MagicNum != guess) {
//        guess += 1
//    }
//    println("Magic number was $guess")


//    TODO: Creating an array
//    var array3: Array<Int> = arrayOf(3, 6, 9, 0)


//    TODO: Two ways to print each item in an array
//    for(i in array3.indices) {
//        println("The item at index $i is: ${array3[i]}")
//    }
//
//    for((index, value) in array3.withIndex()) {
//        println("Index: $index Value: $value")
//    }

//    TODO: My first function, bitch
//    fun myFirstKotlinFunctionBitch(num1: Int, num2: Int) : Int = num1 + num2
//    println("5 + 4 = ${myFirstKotlinFunctionBitch(5, 4)}")

//    TODO: Giving default values for paramaters in a function
//    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
//    println("5 -4 = ${subtract(5, 4)}")

//    TODO: explicitely stating what parameters are what
//    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

//    TODO: if there is no return value use "Unit"
//    fun sayHello(name: String) : Unit = println("Hello $name")
//    sayHello("Mitch")

//    TODO: assigning two values at ones, and returning a "Pair" from a function
//    val (two, three) = nextTwo(1)
//    println("1 $two $three")

//    TODO: calling method using variable arguments
//    println("Sum = ${getSum(1,2,3,4,5,6,8,9)}")

    val numList2 = 1..20

    val listSum = numList2.reduce{x, y -> x + y}
    println("Reduce Sum : $listSum")

}


//fun nextTwo(num: Int): Pair<Int, Int> {
//    return Pair(num+1, num+2)
//}

//    TODO: Function getSum that takes varargs named num of type integer and returns an integer
//fun getSum(vararg nums: Int): Int {
//    var sum = 0
//    nums.forEach { n -> sum += n }
//    return sum
//}


