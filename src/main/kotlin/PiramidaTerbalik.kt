fun main(){
    piramidaTerbalik()
}

fun piramidaTerbalik(){
    val rows = 8
    for ( i in rows downTo  1 ) {
        for (space in 1 .. rows - i) {
            print ("  ")
        }

        for (k in i .. 2 * i - 1) {
            print("* ")
        }

        for (k in 0 .. i - 1 - 1) {
            print("* ")
        }
        println()
    }
}

//ASHA IMALIA ZAHRA
//AND 2