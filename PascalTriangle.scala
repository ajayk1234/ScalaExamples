object PascalTriangle {

  def main(args: Array[String]): Unit = {
    var i = 1
    var n:Int=5
    var m=0
    var a=Array(0,0,0,1,0,0,0,0,0,0)
    var b=Array(0,0,0,0,0,0,0,0,0,0)
    demo
    def demo {
      if(n>m){
        m+=1
//        calvalue(a)
        printspace(n-m)
        printstar(m)
      }
    }

    def printstar(n: Int){
      if(i<=n+1){
        b(i+2)=a(i+1)+a(i+2)
        println(i)
        println("c("+(i+2)+")"+b(i+2))
//        print(a(i+2)+" ")
        i+=1
        printstar(n)
      }
      else
      {
        a=b
        println()
        i=1
        demo
      }
    }

    def printspace(n: Int): Unit ={
      for(i<-0 to n){
        print(" ")
      }
    }

//    def calvalue(a: Array[Int]): Unit ={
//      for(i<- 1 to 8){
//        b(i)=a(i-1)+a(i)
////        println(b(i))
//      }
////      println(b)
//      for(i<- 1 to 8){
//        a(i)=b(i)
//      }
////      println(a)
//    }
  }
}
