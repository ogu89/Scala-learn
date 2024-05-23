package scalavajava

object ScalaPractice extends App{

//  java
//  List<String> list = new ArrayList<String>();
//  List.add("1");
//  List.add("2");
//  List.add("3");

  // scala
  val list = List("1", "2", "3", "4")

  var anyInAction: Any = "A String" //String
  println(anyInAction)

  anyInAction = 5 //Int
  println(anyInAction)

  anyInAction = '☺' //Char
  println(anyInAction)

  anyInAction = 1.985 //Float
  println(anyInAction)

  anyInAction = true //Boolean
  println(anyInAction)

  val stringLiteral: String = "Hello"
  //Driver Code
  println(stringLiteral)

  val floatListeral: Float = 1.2345F
  val somethingBigger: Double = 1.2345e1
  val evenBigger: Double = 1.2345e4

  println(floatListeral)
  println(somethingBigger)
  println(evenBigger)

  var arrayOfEmotion = Array("happy", "sad", "angry", "Excited")
  if(!arrayOfEmotion.isEmpty){
    arrayOfEmotion(0) = "joyful"
  }

  //Driver Code
  arrayOfEmotion.foreach(println)

  var count = 1
  while (count <= 10){
    println(count)
    count+= 1
  }

  for(i <- 1 to 5){
    println(s"iteration $i")
  }

  def sum(x: Double, y: Double): Double = {
    x + y
  }

  class Person{
    var name: String = "temp"
    var gender: String = "temp"
    var age: Int = 0

    def walking = println(s"$name is walking")

    def talking  = println(s"$name is talking")

  }
  // Creating an object of the Person class
  val firstPerson = new Person

  firstPerson.name = "Mary"
  firstPerson.gender = "female"
  firstPerson.age = 25

  println(firstPerson.name)
  println(firstPerson.gender)
  println(firstPerson.age)


  class Complex(real: Double, imaginary: Double) {
    def re = real

    def im = imaginary

    override def toString(): String = "" + re + (if (im < 0) "+" else "") + im + "i"
  }

  trait Iterator[A] {
    def hasNext: Boolean
    def next(): A
  }

  class IntIterator(to: Int) extends Iterator[Int]{
    private var current = 0
    override def hasNext: Boolean = current < to
    override def next(): Int = {
      if(hasNext) {
        val t = current
        current += 1
        t
      } else {
        0
      }
    }
  }

  val iterator = new IntIterator(10)
  iterator.next()
  iterator.next()
}

