import java.io._

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }

}

object SingletonClass {
  def main(args: Array[String]) {
    val p = new Point(10, 20)
    val pp = new Point(30, 40)
    printPoint
    printpPoint

    def printPoint() {
      println(p.x)
      println(p.y)
    }
    def printpPoint() {
      println(pp.x)
      println(pp.y)
    }
  }
}
