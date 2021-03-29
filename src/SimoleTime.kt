import kotlin.math.min

class SimpleTime (val hours: Int=0, val minute:Int=0,val seconds: Int=0,val nanoseconds:Int=0){

    fun toSecondOfDay():Int{
        return ((hours*3600)+(minute*60)+seconds)

    }
    fun toNanoOfDay():Int{
        var x =(hours*3600 + minute*60)
        return ((x+seconds)*1000000000+(nanoseconds))
    }



}