fun main() {
    var g=human("Sharon",12,30 )
    g.eat(20)
    g.speak("I love AkiraChix it educates women in community about information technology")
g.birthday(21)


}
class human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        var f= 20
        weight +=foodWeight
        println("I am eating" + " " + weight +"kgs of food")
        var details=User("Sharon","Lubembe","lubembesharon5@gmail.com",7222,"....")
println(details.firstName)
        println(details.Email)
    }
fun speak(speech:String){
    println(speech)


}
    fun birthday(date:Int){
        var date=21
        date+=age
        println(date)

    }
    data class User(var firstName:String,var lastName:String,var Email:String,var phoneNumber:Int, var password:String,)


}
