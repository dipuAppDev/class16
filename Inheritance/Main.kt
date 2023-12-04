package Inheritance

fun main(args: Array<String>) {
    var mango = Mango("Lengra","Yellow",1.5)
    println("Mango : ${mango.name} ${mango.color} ${mango.weight}")
//    mango.name = "Lengra"
//    mango.color = "Yellow"
//    mango.weight = "1 kg"
    var banana = Banana("Sagor","Yellow",1.2,"10 inch")
    println("Banana : ${banana.name} ${banana.color} ${banana.weight}")
//    banana.name = "Sagor"
//    banana.color = "Yellow"
//    banana.weight = "5g"
}