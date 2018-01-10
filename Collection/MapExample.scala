package Collection

object MapExample {

  def main(args: Array[String]): Unit = {

    var A:Map[Char, Int] = Map('a'->10 )
//  add keys and values
    A+=('b'->20)
    println(A)
    println("Keys in Map"+ A.keys)
    println("Values in Map"+A.values)
    println("isEmpty Map"+ A.isEmpty)

    val B:Map[Char,Int]= Map('c'->30,'d'->40)
//  concat
    var C =A++B
//  var C = A.++(B)
    //  foreach
    C.keys.foreach{ i=>
      println("Keys: "+i)
      println("Values: "+C(i))
    }
//  if contains

    if(C.contains('d')){
      println(C('d'))
    }

  }

}
