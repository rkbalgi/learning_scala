object Main {

  def main(args: Array[String]): Unit = {

    val list=List(1,2,3,4,5,6,7,8,9,10)

    //multiple params
    val addFunc: (Int, Int) => Int = (a: Int, b: Int) => a + b
    val foldLeftWith0 = list.foldLeft(0)(_)
    val foldLeftWith5 = list.foldLeft(5)(_)

    val foldLeftWith5AndMult = list.foldLeft(5)(_+_)

    println(foldLeftWith0(addFunc))
    println(foldLeftWith5(addFunc))
    println(foldLeftWith5AndMult)

    println("Hello World")
  }

}
