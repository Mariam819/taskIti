fun main(){
    var map = mapOf <String,String>("a" to "android","j" to "java" ,"k" to "kotlin","kt" to "kotlin")
    println(map)
    println(map.keys)
    println(map.values)
    val entries = map.entries
    for(i in entries){
        println("${i.key} -> ${i.value}" )
    }
//    *******************
    var list1 = mutableListOf<String>("a","j","k")
    var list2 = mutableListOf<String>("android","java","kotlin")
    var map2 = mutableMapOf<String,String>(list1[0] to list2[0])
   println(map2)

var trim ={text:String -> println(text.substring(1,text.length-1))}
  trim("mariam")
    }
