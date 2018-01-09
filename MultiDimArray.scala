import Array._
object MultiDimArray {

  def main(args: Array[String]): Unit = {
    var a = ofDim[Int](3, 3)
//Adding some value to Array
    for (i <- 0 to (a.length - 1))
      for (j <- 0 to (a.length - 1)) {
        a(i)(j) = i + j
      }
//Display Array
    for (i <- 0 to (a.length - 1)) {
      for (j <- 0 to (a.length - 1)) {
        print(" " + a(i)(j));
      }
      println();
    }
  }

}
