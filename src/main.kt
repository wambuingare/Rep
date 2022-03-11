fun main(){
    program()
    modulus ()
    var m = "Hello my name is Nancy and I am 23 years old."
    println(m)
    var z = m ()
            println(z)
    var s = me("Muthoni")
}
fun program(){
    var name ="codeHive"
    println(name[4].toString()+name[5]+name[6]+name[7])
}
fun modulus(){
    var x = 20
    var y = 9
    var modulus = x%y
    println(modulus)
}
fun sentence(name:String, age:Int): String {
    var m = name.toString() + age
    return m
}
fun m():Int{
    var text = "Computer"
    var z = text.length
    return z
}
fun me (name:String){
    if (name=="Wambui")
        println("that is me")
    else
        println("I don't know who that is")

}