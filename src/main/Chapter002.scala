package main

/**
  * Created by zengyong on 2017/12/12.
  * include expressions , blocks , functions , methods
  */
object Chapter002 {
  def main(args: Array[String]): Unit = {

    //Expressions
    val myVal : String  = "xx"  // Values cannot be re-assigned.
    var myVar : String  = "Foo" //Variables are like values, except you can re-assign them.
    myVar = "Too"
    println(myVar)

    //Blocks
    println({
      val x = 1 + 1
      x + 1
    }) //3

    //Functions
    (x: Int) => x + 1
    val addOne = (x: Int) => x+1
    print(addOne(1))

  }


  //Methods
  def add (x: Int, y: Int): Int = x+y
  println(add(1,2))

  def addThenMultiply(x: Int, y: Int)(multiplier : Int): Int = (x+y)*multiplier
  println(addThenMultiply(1,2)(3))

  def name: String = System.getProperty("name")
  println("Hello, "+name+ "!")

  def getSquareString(input: Double): String = {
    val  square = input * input
    square.toString
  }
  println(getSquareString(2))

}
