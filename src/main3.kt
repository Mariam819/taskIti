
import java.util.Collections
data class player(val score: Int, val  name: String)


fun main() {
  var map = mutableMapOf<Int ,String>(341 to "Ahmed",273 to "Mohammed", 278 to "ismail",329 to "Hend"
    ,445 to "Aly",402 to "Hossam" ,388 to "Ola",275 to "Alaa",
        243 to "Bassma",334 to "Mina",412 to "Nada", 393 to "Saad")
  val sorted = map.toSortedMap()
  println( " his score:  ${sorted.lastKey()}")
    println("his name: ${map.get(sorted.lastKey())}")




    val public = listOf(
        player(341, "Ahmed"),
        player(273, "Mohammed"),
        player(278, "ismail"),
        player(329, "Hend"),
        player(445, "Aly")
    )
    val maxScore = public.maxByOrNull { p -> p.score }
    println(maxScore)
    println("player Name: ${maxScore?.score}")
    println("player Score: ${maxScore?.name}")

}