package crashcourse

object BeginnersCrashCourse extends App{
  var var1 = 1;
  val var2 = 2;

  val bool: Boolean = true
  val chr: Char = 'a'
  var str: String = "String"
  val int: Int = 123
  val shrt: Short = 123
  val lng: Long =  123
  val lng2 = 123L
  val flt: Float = 123.0f
  val dbl: Double = 123.0

  // Methods
  def greetings(name: String): String = "Hello " + name
  println(greetings("All Good"))

  def greetingsModified(name: String): Unit = println("Hello " + name)
  greetingsModified("All Good")

  def greetingsFromSystem: Unit = println("Hello, you are learning Scala!")
  greetingsFromSystem

  def methodWidthCodeBlock(name: String): String = {
    "Hello " + name
  }
  println(methodWidthCodeBlock("Jap"))

  def methodWithSomethingElse(name: String): String = {
    println("inside methodWithSomeiohtingElse")
    "Hello " + name
  }
  methodWithSomethingElse("jj")




}