package Collection

object IteratorExample {

  def main(args: Array[String]): Unit = {
    var itr = Iterator(10, 20, 30, 40, 50)
    println(itr.max)
//    println(itr.min)
    println(itr.isTraversableAgain)
//    println(itr.length)
//    println(itr.size)

//    while(itr.hasNext){
//      println(itr.next())
//    }

  }
}
