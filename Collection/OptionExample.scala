package Collection

object OptionExample {

  def main(args: Array[String]): Unit = {
    val aa = Map('a' -> 10, 'b' -> 20)

    def show(x: Option[Int]) = x match {
      case Some(s) => s
      case None    => 30
    }
    println(show(aa.get('a')))
    println(show(aa.get('c')))


    val a:Option[Int]=Some(10)
    val b:Option[Int]=None

    println(a.getOrElse(20))
    println(b.getOrElse(40))
  }
}
