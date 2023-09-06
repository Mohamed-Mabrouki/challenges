fun main() {
    generateSpiralMatrix(3)

}

fun generateSpiralMatrix(n: Int) {
    var m = Array(n) { IntArray(n) { 0 } }
    var f = n
    var ini = 0
    var d = 0
    var ii = 0
    var jj = 0
    var test = true
    while (test) {
        if (d >= f-1) {
            break
        }
        if (ii == d && jj == d) {
            for (j in d..f - 1) {
                m[ii][jj] = ini
                ini++
                jj = j
            }
        } else if (jj == f - 1 && ii == d) {
            for (i in d..f - 1) {
                m[ii][jj] = ini
                ini++
                ii = i
            }

        } else if (jj == f-1 && ii == f-1) {
            for (j in f-1 downTo d) {
                m[ii][jj] = ini
                ini++
                jj = j
            }
        } else if (ii == f-1 && jj == d) {
            d++
            f--
            for (i in f-1 downTo d) {
                m[ii][jj] = ini
                ini++
                ii = i
            }



        }
        for (row in m) {
            println(row.contentToString())
        }

    }
//    for (row in m) {
//        println(row.contentToString())
//    }
//    var i = 0
//    var j = 0
//    var ini = 1
//    var test = true
//    while (test) {
//        m[i][j] = ini
//        ini++
//        if (j == f  && i < f ) {
//            i++
//        } else if (j == f  && i == f ) {
//
//            j--
//        }
//        else if(){
//            i--
//
//        }
//        else if(i==d&&j==d-1){}
//
//    }


}