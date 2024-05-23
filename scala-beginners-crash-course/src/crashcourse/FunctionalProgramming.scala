package crashcourse

object FunctionalProgramming {

  // normal function definition using function1 object
  val function1 = new Function1[String, Int] {
    override def apply(v1: String): Int = 10
  }



  // syntactic sugar for Function2[int, int, int]
  val function2: (Int, Int) => Int =  (x, y) => x + y
  // here we do not need tot instantiate and override apply method,
  // compliler does that for us

  // general multiply function
  val miltiply = new Function2[Int, Int, Int]{
    override def  apply(v1: Int, v2: Int): Int = v1 * v2
  }

  // way 1: anonymous function
  val multiplyway1 = (x: Int, y: Int) => x * y

  // way 2: anonymous functions
  val miltiplyway2:(Int, Int) => Int = (x, y) => x*y

  // some more ways to write anonymous functions
  // depending upon the need
  val dosomething= () => 10  //doSomething() -> 10

  val doSomethingBetter: () => Int = () => 10 //doSomethingBetter() => 10

  // remember, when it comes to lambdas like above
  // it must be alled with ()

  //  we can use placeholder _ for 1 or 2 arguments
  // complier will do the trick to replace these placeholders

  val someFunc: Int => Int = _ + 1 //someFunc(1) -> 2

  val someBeterFunc: (Int, Int) => Int = _ + _ //someBetterFunc(1, 2) -> 3

  // a higher order function
  val hofFunc: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = ???

  // curry addition
  val curryAddition: Int => (Int => Int) = x => (y => x + y)
  println(curryAddition(1)(2)) //println 3

  // first curryAddition(1) evaluates to a function of type (Int => Int) = y: Int => 1 + y
  // second, it takes (2) as an argument and pass it to the evaluated function
  // hence, curryAddition(1) -> anonFync: Int => Int = y => 1 + y
  // at last, anonFunc(2) -> 1 + 2 -> 3

  // OR

  // a curried function will be created,
  // to add 3 to every number passed to adder.
  val adder = curryAddition(3)
  println(adder(1)) //println 4
  println(adder(2)) //println 5

  // muptiple parameter lst curries
  def curryAdder(x: Int)(y: Int): Int = x + y
  println(curryAdder(1)(2))
}
