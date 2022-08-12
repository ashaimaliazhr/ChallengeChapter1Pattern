fun main() {
    belahKetupat()
}

fun belahKetupat() {
    for (i in 1 .. 8) {
        for (j in 8 downTo i) {
            print(" ")
        }
        for (k in 1 .. i){
            print("*")
        }
        for (l in 1 .. i - 1) {
            print("*")
        }
        println()
    }

    for (i in 1 .. 9) {
        for (j in 1 .. i - 1){
            print(" ")
        }
        for (z in 9 downTo i) {
            print("*")
        }
        for (k in 8 downTo i){
            print("*")
        }
        println("")
    }
}

//ASHA IMALIA ZAHRA
//AND 2