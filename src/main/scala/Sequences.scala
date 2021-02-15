import scala.collection.mutable

object Sequences extends App {
  val mySeq = Seq(1,2,4,5) //generally this us used
  val myMutableSeq = mutable.Seq(1,2,6,7) //or use this, if necessary to change contents
  //two lines below should not be used
  var mySeqThatCanChangedToSomethingElse = Seq(1,2,6,7)
  var mutableAndChangeableToSomethingElse = mutable.Seq(1,4,6,7,9)
  mySeqThatCanChangedToSomethingElse = Seq(5,5,5,2,5) //var lets us reassign to new values

  println(mySeq)
  println(myMutableSeq) //ARRAYBUFFER is meant for building up some sequence for converting to immutable sequence
  println(mySeq.reverse)
  println(mySeq.mkString(" :-) "))
  println(mySeq.tail) //everything without first element
  println(mySeq.head) //.head prints just 1!!!
  println(mySeq.contains(9000))
  println(mySeq.contains(4))
  println(mySeq.indexOf(5))
  println(mySeq.indexOf(555)) //result -1 means it is not found on sequence
  println(mySeq.map(el => el+10)) //a function on how to transfer each element in our sequence
  val mappedSeq = mySeq.map(_ * 100) //shorthand for map (el => el * 100)
  println(mappedSeq)

  //map is one of the ways how to work with immutable data, we transform it to another data
  //one of the advantages of this approach is that ir works also on parallel machines (clusters of machines)

  val filteredSeq = mySeq.filter(el => el > 3)
  println(filteredSeq)
  mySeq.foreach(el => println(el+20)) //thus will print each element +20

  //Scala is not keen on mutating, but it is possible
  //generally it is done before finalizing data into some immutable
  //https://alvinalexander.com/scala/how-to-append-prepend-items-vector-seq-in-scala/
  println(myMutableSeq :+ 100)
  println(myMutableSeq) //it prints, but it is nod saved
  val newMutable = myMutableSeq :+ 100 //thus is how we save data
  println(newMutable)
  val newImmutable = mySeq :+ 2000 //so again it has to be saved
  println(newImmutable)
  newMutable.drop(6)
  println(newMutable)
  val anotherMutable = newMutable.drop(2) //it drops from beginning
  println(anotherMutable)

  val bigSeq = (1 to 10).toVector //range is smth half ready given on demand, VECTOR is smth already made
  println(bigSeq)
  println(bigSeq.slice(3,6)) //prints from till, 4 is 3rd element, 7 (not included) is 6th element
  val newSlice = bigSeq.slice(2,5) //SLICING and DICING
  println(newSlice)
  println(newSlice.length)
  val by1000 = newSlice.map(_ * 1000)
  println(by1000)
  //usually Seq and Scala pick the most appropriate data container

  //Array comes fom Java and is not as nice as printing
  val a2 = Array("one", "two", "three", "four")
  val a3 = Array(100, "two", "three", "four") //try to avoid this! keep one type per sequence
  println(by1000(2))
  println(by1000.last)
  println(a2.slice(1,3).toSeq.toString)

  println(bigSeq.sum)
  println(bigSeq.length)
  println(bigSeq.sum/bigSeq.length. toDouble) //aritmetic means one of the values be DOUBLE long as regular
}
