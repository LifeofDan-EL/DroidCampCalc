
class MyCal(val num1: Int, val num2: Int){

    val addition = num1 + num2
    val subtraction = num1 - num2
    val multiplication = num1 * num2
}

fun main(args: Array<String>){

    print("Sum of 20, 10 = ")
    println(MyCal(20,10).addition)

    print("Subtraction of 20, 10 = ")
    println(MyCal(20,10).subtraction)

    print("Multiplication of 20, 10 = ")
    println(MyCal(20,10).multiplication)
}