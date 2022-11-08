fun testWhen(){
    val day = 1;
    println("--TestWhen--")
    when(day){
        1-> println("New Year's Day")
        8->println("Loykratong Day")
        13->println("Songkrant Day")
        30-> println("Halloween Day")
        31-> println("Ghost Day")
        else-> println("Invaid Day")
    }
}

fun testWhen2(){
    val day = 30;
    println("--TestWhen2--")
    val result = when(day){
        1-> "New Year's Day"
        8-> "Loykratong Day"
        13-> "Songkrant Day"
        30-> "Halloween Day"
        31-> "Ghost Day"
        else-> "Invaid Day"
    }
    println(result)
}
fun testWhen3(){
    val day = 1;
    println("--TestWhen3--")

    val result = when(day){
        1,2,3,4,5-> "Weekday"
        else-> "Weekend"
    }
    println(result)
}
fun testWhen4(){
    val day = 2;
    println("--TestWhen4--")
    val result = when(day){
        in 1..5 -> print("Weekday")
        else-> "Weekend"
    }
    println(result)

}
fun testWhen5(){
    val day =2
    println("--TestWhen5--")
    val result = when(day){
        1->{
            print("First day of the week : ")
            print("Monday")
        }
        2->{
            print ("Second day of the week : " )
            print ("Tuesday ")
        }
        3->{
            print("Third day of the week : ")
            print("Wendesday")
        }
        4->{
            print("First day of the week : ")
            print("Thursday")
        }
        else->{
            "Invaid"
        }
    }
    println(result)
}