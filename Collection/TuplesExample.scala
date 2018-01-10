package Collection

object TuplesExample {

  def main(args: Array[String]): Unit = {

    val t = new Tuple2(1,"Ajay")
    println(t._1)
    println(t._2)

    t.productIterator.foreach{i=>
      println("values: "+ i)
    }
//    swap

    println(t.swap)
  }
}
