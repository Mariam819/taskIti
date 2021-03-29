import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList

fun String.RemoveFirstAndLastLatter():String {
     return this.substring(1, this.length - 1)
          }
//************************************************

fun String.largestWord() {
     var word: String = ""
     var length: Int = 0
     var largest: String
     var arr= this.split(" ").toTypedArray()
     arr.contentToString()
    largest=arr[0]
     for(i  in arr.indices){
          if(largest.length < arr[i].length)
               largest = arr[i];
     }
     println(largest)
     }

//**************************************************
class client(var name:String= "unspecified", var email:String= "unspecified", var country:String= "unspecified"
             , var city:String= "unspecified", var street:String= "unspecified") {


     fun getFullInfo(){
          println("name: $name")
          println("email: $email")
          println("country: $country")
          println("city: $city")
          println("street: $street")

     }


}



