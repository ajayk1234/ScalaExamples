package Traits

object Test {

  def main(args: Array[String]): Unit = {

    def sum(a:Int,s:String,ss:String): Unit ={
      println(a)
      println(s)
    }

    sum(5,"Aaa",ss="aha")

    println(for(i <- 0 to 10) yield 10-i)


  }


  for(i<- (1 to 10).reverse){
    print("a "+ i)
  }
}
