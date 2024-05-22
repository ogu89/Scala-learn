package crashcourse

object ClassAndObject extends App{
  class Student // defining a Student class
  val aStudent = new Student

  class Student1(name: String, rollno: Int)

  class Student2(val name: String, val rollno: Int)

  class Student3(val name: String, val rollno: Int){
    def greetings(name: String): Unit = {
      println(this.name) // prints name passed as class parameter
      println(name) // prints name passed to greetings method
    }
  }

  val student3 = new Student3("Ash", 1)
  student3.greetings("how was your trip");

  object Student4{
    val name: String = "Ash"
    val rollno: Int = 1
    println("This is a Student Object")
  }

  val anonClass = new Student {
    def greeting(name: String): Unit = println(name)
  }
  anonClass.greeting(("Ash"))


  case class Student5(name: String, rollno: Int)

  class Student6 extends Student //Single level inheritance

  abstract class Studentx{
    def name: String
    def rollno: Int
  }
}

trait Eat{
  def eating(): Unit
}

