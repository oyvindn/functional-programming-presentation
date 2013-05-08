package no.nerbraten.oyvind

object Test {

  def main(args: Array[String]) {

    // Closures

    def multiplierClosureFactory(inc: Int): (Int => Int) = (x: Int) => x * inc

    val incrementByTwo = multiplierClosureFactory(2)

    println(incrementByTwo(4))



    // Currying

    def multiply(x: Int)(y: Int) = x * y

    val multiplyByTwo = multiply(2) _

    println(multiplyByTwo(4))



    // Partially applied function

    def multiply2(x: Int, y: Int) = x * y

    val multiplyByTwo2 = multiply2(2, _: Int)

    println(multiplyByTwo2(4))

  }

}
