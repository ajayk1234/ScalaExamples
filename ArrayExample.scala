object ArrayExample {

  def main(args: Array[String]): Unit = {

    var a = Array(1.1, 2.2, 3.3, 4.4, 5.5)
    var total = 0.0
    for (x <- a) {
      total += x
    }
    println(total)

    for (i <- 0 to (a.length - 1)) {
      a(i) += 1
    }

    var max = a(0)

    for (i <- 1 to (a.length - 1)) {
      if (a(i) > max)
        max = a(i)
    }
    println(max)

  }
}
