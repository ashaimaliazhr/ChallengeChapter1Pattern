fun main() {
    plusBintang()
}

fun plusBintang() {
    val rows = 5
    for (i in 1 .. rows){
        for (j in 1 .. rows){
            if (i==3 || j==3) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

//ASHA IMALIA ZAHRA
//AND 2