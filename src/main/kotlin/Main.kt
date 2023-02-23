fun main(){
name()
    arrange()
    values()
labels("john","paul","peter")


}
 fun name(){
var names = arrayOf("caren","zilvia","jerry","ruth","naomi")
    println(names.contentToString())

    }
fun arrange(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
println(cities.map { cities.map { it.capitalize()} })

           }

fun  values(){
var value = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(value[2]+value[5])
    println(value.indexOf(158))
    println(value.sortedArray().contentToString())

}
fun labels(nam1:String,nam2: String,nam3: String):Array<String>{
    var label = arrayOf(nam1,nam2,nam3)
    return (label)

}









