import java.util.*

class Tester {
    fun main(){

        println("Press 1 to enter account details\n" +
                "- Press 2 to deposit\n" +
                "- Press 3 to withdraw\n" +
                "- Press 4 to show current balance\n" +
                "- Press 5 to cancel last transaction\n" +
                "- Press 6 to exit")
        var sc = Scanner(System.`in`)
        var x = sc.nextInt()
        var account = Account()
        when (x) {
            1 -> {
                println("Please Enter  your AccountNumber ")
                var sc1 = Scanner(System.`in`)
                var number = sc1.nextInt()

                println("Please Enter  your name  ")
                var sc2 = Scanner(System.`in`)
                var name = sc2.next()

                println("Please Enter  your AccountNumber ")
                var sc3 = Scanner(System.`in`)
                var MyBalance = sc3.nextDouble()

                var account = Account(number,name,MyBalance)
                }

            2 -> {
                println("Please Enter  your required amount of money that you want to deposit it ")
                var sc = Scanner(System.`in`)
                var requiredAmount = sc.nextDouble()
                var D= Deposit()
                D.amount=requiredAmount
                D.execute( account)

            }
            3 ->{
                println("Please Enter  your required amount of money that you want to withdraw it ")
                var sc = Scanner(System.`in`)
                var requiredAmount = sc.nextDouble()
                var W= Withdraw()
                W.amount=requiredAmount
                W.execute( account)
            }
            4 -> {
                println("Please Enter  your required currency type \n" +
                        "'U for USD, E for euro' ")
                var sc = Scanner(System.`in`)
                var requiredAmount = sc.next()

            }
            5 -> println("x is 1")
            6 -> println("x is 1")
            else -> println("X is neither 0 or 1")
    }








}


    }