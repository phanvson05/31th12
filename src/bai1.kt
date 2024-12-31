fun main(args: Array<String>) {
    println("nhập số a :")
    val inputa = readLine()
    val a = inputa?.toIntOrNull()


    println("nhập số b :")
    val inputb = readLine()
    val b = inputb?.toIntOrNull()

    sosanh(a!!,b!!)
    cong(a!!,b!!)
}

fun sosanh(a:Int , b:Int){
    if(a>b){
        println("$a is greater than $b \n")
    }else if(a<b){
        println("$a is less than $b \n")
    }else {
        println("$a = $b \n")
    }

}
fun cong(a:Int , b:Int){
   val c = a+b
    println("a+b=$c")

}



