import java.awt.font.NumericShaper.Range

fun main(){
    println( containsRange(5..20,9..15))



}


fun containsRange(a:IntRange,b:IntRange): Boolean {
    var d1=-1
    var d2=-1
    var f1=-1
    var f2=-1
    for (i in a){
        d1=i
        break
    }
    for (j in b){
        d2=j
        break
    }
    for (i in a){
        f1=i

    }
    for (j in b){
        f2=j

    }
    return if(f2>f1||d1>d2){
        false
    }
    else{
        true
    }



}