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


}
