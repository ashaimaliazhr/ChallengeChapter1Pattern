fun main() {
 xBintang()
}

fun xBintang() {
    var rows = 16

    for(i in 1 .. rows) {
        for (j in 0 .. rows){
            if (i==j || i+j==rows) {
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