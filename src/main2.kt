fun main(){
var x :String ="abbcccccd"
   println( x.codePointCount(1,3))
  println(  x.filter {
        it in x
    }.groupBy { it }.count())








}
