fun main() {
    sumZero(5, -5,5 ,9, -9)

}

fun sumZero(vararg t: Int) {
    val n = t.size
    var str: String? = null
    var test = false
    for (i in 0..n - 2) {
        for (j in i + 1..n - 1) {
            if ((t[i] + t[j]) == 0) {
                println("the pair is:")
                println(t[i])
                println(t[j])
                test = true


            }}
            if (test) {
                break


        }
    }
}