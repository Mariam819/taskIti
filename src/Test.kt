import java.util.*

fun main() {
    println("enter your IP")
    var sc = Scanner(System.`in`)
    var ip = sc.next()
    var sum = 0
    val array: CharArray = ip.toCharArray()
    var r = 0.rangeTo((ip.length) - 1)
    for (i in r) {
        if (array[i] == ('.')) {
            sum = sum + 1
        }
    }
    if(sum==3){
        var r = 0.rangeTo((ip.length)-1)
        for (i in r) {
            if (array[i] == ('.')) {
                println()
            }
            else{
               print(array[i])

            }
        }

    }else{
        println("error")
    }
}