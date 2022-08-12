fun main(){
    piramidaBintang()
}

fun piramidaBintang() {
    val rows = 8
    var j = 0
    for ( i in 1 .. rows){

        for (space in 1 .. rows - i){
            print("  ")
        }
        while (j != 2 * i - 1){
            print("* ")
            ++j
        }
        println()
        j = 0
    }
}

//ASHA IMALIA ZAHRA
//AND 2