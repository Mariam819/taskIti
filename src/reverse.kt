import java.util.*

fun  main(){
    println("please enter integer")
    var sc = Scanner(System.`in`)
    var num = sc.nextInt()
    var reverse :Int = 0
    while(num != 0) {

     var  x: Int = num % 10
       reverse = reverse * 10 + x
        num /= 10
    }

    println("Reversed Number: $reverse" )
}
