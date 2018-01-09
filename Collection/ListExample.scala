package Collection

object ListExample {

  def main(args: Array[String]): Unit = {

    val a = List("a", "b", "c", "d")
    val b: List[Int] = List(1, 2, 3, 4, 5)
    val empty: List[Nothing] = List()
    val c = List(List(1, 2, 3), List("a", "b", "c"))
    for (x <- a) {
      println(x)
    }

    for (x <- b) {
      println(x)
    }

    for (x <- empty) {
      println(x)
    }

    for (x <- c) {
//      println(x)
      for (i <- x) {
        print(" " + i)
      }
      println()
    }

//    List using ::

    val d = "Ajay" :: ("Vijay" :: ("Jay" :: Nil))

    for (x <- d) {
      print(" " + x)
    }
    println()

    val e = (1 :: (2 :: (3 :: Nil))) ::
      (4 :: (5 :: (6 :: Nil))) ::
      (7 :: (8 :: (9 :: Nil))) ::
      (10 :: (11 :: (12 :: Nil))) :: Nil
    for (x <- e) {
      for (i <- x) {
        print(" " + i)
      }
      println()
    }

//    head,tail,isEmpty

    println("Head of List d: " + d.head)
    println("Tail of LIst d: " + d.tail)
    println("isEmpty d: " + d.isEmpty)
    println("isEmpty empty: " + empty.isEmpty)

//    List concat using both List.concat and .:::

    val f = a.:::(b)
    val g = List.concat(c, d)

    for (x <- f) {
      print(" " + x)
    }
    println()

    for (x <- g) {
      print(" " + x)
    }
    println()

//    Uniform List
    val num = 0
    val fruit = List.fill(5)("apple")
    val number = List.fill(10)(num + 2)

    println(number)

    for (x <- fruit) {
      print(" " + x)
    }
    println()

    val square = List.tabulate(6)(n => n * n)
    println(square)

    val mul = List.tabulate(4, 5)(_ * _)
    println(mul)

  }
}
