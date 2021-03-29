

import java.util.*


fun main() {
var name :String = "Mariam"
  println( name.RemoveFirstAndLastLatter())
// *****************************
 var x = "this is house"
 var y ="big flower"
 x.largestWord()
    y.largestWord()

// **************************
var z ="abcccccd"
    println(z.MaxChar())

   var s1 = SimpleTime(hours=12)
   println(s1.toSecondOfDay())
    var s2 = SimpleTime(hours=6, minute = 30)
    println(s2.toSecondOfDay())
    var s3 = SimpleTime(seconds = 1)
    println(s3.toNanoOfDay())
    var s4= SimpleTime(hours = 1, minute = 3,seconds = 5,nanoseconds = 10)
    println(s4.toNanoOfDay())

//********************************

var alice =client(email = "alice@gmail.com",country = "Germany",city = "Munich")
alice.getFullInfo()
}




