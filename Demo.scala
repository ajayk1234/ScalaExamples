class Point(val xc: Int, val yc: Int ){
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int ,dy: Int): Unit ={
    x = x + dx
    y = y + dy
    println(x)
    println(y)

  }
}




object Demo
  {
    def main(args: Array[String]): Unit ={
      val p = new Point(10,20)
      p.move(1,2)
    }
  }