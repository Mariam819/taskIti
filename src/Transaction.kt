 abstract class Transaction (){

      var transactionId : Long=0
   abstract fun execute (account: Account ):Double

 }

class BalanceInquiry: Transaction() {
   lateinit var currencyType: String
    override fun execute(account: Account): Double {
        if(currencyType=="U"){balance=balance*30}
        if(currencyType=="E"){balance=balance*20}
        return balance
    }


}
 class Withdraw : Transaction(),Rollback  {
     var amount: Double = 0.0
     override fun execute(account: Account): Double {
         balance = balance - amount
         return balance
     }

     override fun cancelTransaction(account: Account): Double {
         balance = balance + amount
         return balance
     }
 }
     class Deposit : Transaction(),Rollback{
          var amount : Double =0.0

         override fun execute(account: Account): Double {
              balance = balance+amount
           return balance
         }

         override fun cancelTransaction(account: Account): Double {
             balance = balance - amount
             return balance
         }

     }





