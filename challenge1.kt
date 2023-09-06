fun main(){
    getDuplicatedParams("a","b","b","a","c")


}
fun getDuplicatedParams(vararg str:String){
    var t= Array(0){""}
    for(i in 0..str.size-1){
        for(j in i+1..str.size-1){
            if(str[i]==str[j]&& str[i] !in t){
                t+=str[i]
            }
        }
    }
    println(t.contentToString())

}