import Array._
object ConcateArray {

  def main(args: Array[String]): Unit = {

    var a = Array(1.0, 1.1, 1.2, 1.3, 1.4)
    var b = Array(1.5, 1.6, 1.7, 1.8, 1.9)
    //Concating Arrays
    var c = concat(a, b)

    for (x <- c) {
      println(x)
    }

    //Create Array using range()
    var ar = range(10, 20, 5)
    var arr = range(10, 20)

    for (x <- ar) {
      print(" " + x)
    }
    println()
    for (x <- arr) {
      print(" " + x)
    }
    println()
  }
}
