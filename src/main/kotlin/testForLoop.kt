fun testForLoop(){
    for (x in 1..10){
        println(x)
    }
}

fun testForLoop2(){
    val min = 2
    val max = 6
    var count = 0
    for(i in min..max){
        if(i % 3 == 0){ //1%3 =1
            count++
        }
    }
    println( " " + count)
}

fun testForLoop3(){
    for(i in 0 until 100 step 20){
        println(i)
    }
}

fun testForLoop4(){
    for(i in 10 downTo 1){
        println(i)
    }
}

fun testForLoop5(){
    for(i in 1 ..5) print(i)
    println("")
    for(i in 5.. 1)  print(i)
    println("")
    for(i in 5 downTo 1) print(i)
    println("")
    for(i in 1..5 step 2) print(i)
    println("")
    for(i in 5 downTo 1 step 2) print(i)
}

fun testForLoopArray(){
    var language = arrayOf("Ruby","Kotlin","Python","Java")
    for(item in language ){
        print(item + ",")
    }
}

fun testForLoopString() {
    var text = "Kolin"
    for (letter in text) {
        print(letter)
    }
}