package Collection

object SetExample {

  def main(args: Array[String]): Unit = {

    val a = Set("a", "b", "c", "d")
    val b = Set("e","f","g","g")
    println(a)

    println("head of set is: "+ a.head)
    println("tail of set is: "+ a.tail)
    println("isEmpty: "+a.isEmpty)
//  concat
    val c = a ++ b

    println(c)
//  concat
    val d = a.++(c)

    println(d)

    val set1 = Set(10,50,12,60,23,3,40)
    val set2 = Set(10,20,30,40,50,60,70)
    println("max element in set is : "+ set1.max)
    println("min element in set is : "+set1.min)


//    common value

    println("set1.&set2 "+ set1.&(set2))
  }

}
