object PascalTriangle {

  def main(args: Array[String]) {
    val input: Int = scala.io.StdIn.readInt()
    var array = Array.fill(input + 5)(0)
    var temp_array = Array.fill(input + 5)(0)
    array(3) = 1
    var i = 1
    var m = 0
    printSpace(input)
    println(array(3))
    printPascal
    def printPascal {
      if (input > m) {
        m += 1
        calArray(array)
        printSpace(input - m)
        printNumber(m)
      }
    }

    def printNumber(n: Int) {
      if (i <= n + 1) {
        print(array(i + 2) + " ")
        i += 1
        printNumber(n)
      } else {
        println()
        i = 1
        printPascal
      }
    }

    def printSpace(n: Int) {
      for (i <- 0 to n) {
        print(" ")
      }
    }

    def calArray(arr: Array[Int]) {
      for (i <- 1 to input + 3) {
        temp_array(i) = arr(i) + arr(i - 1)
      }
      for (i <- 1 to input + 3) {
        array(i) = temp_array(i)
      }
    }
  }
}
