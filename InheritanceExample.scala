class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println(x)
    println(y)
  }

}

class Location(override val xc: Int, override val yc: Int, val zc: Int)
    extends Point(xc, yc) {

  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println(x)
    println(y)
    println(z)
  }

}
object InheritanceExample {
  def main(args: Array[String]){
    val l = new Location(10,20,30)
    l.move(1,2)
  }
}
