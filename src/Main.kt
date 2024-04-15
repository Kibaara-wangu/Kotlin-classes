//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val person = Person("Jane",21,"Kenya")
    person.details()

    val rectangle = Rectangle(40,10)
    println(rectangle.calculateArea())

    val numbers = listOf(30,12,50,60,10)
    val maxNumber = findMaxNumber(numbers)
    println("This is the maximum number: $maxNumber")

    val car = Car("Bus","Toyota","Yelow",20)
    car.carry(30)

    car.identity()

    println( car.calculateParkingFees(3))


}
// Write a Kotlin program that creates a class 'Person' with properties for name, age, and country.
// Include a function to print the person's details.
class Person(var name:String, var age:Int,var country:String){
    fun details(){
        println("My name is $name, I am $age years old and am from $country")
    }
}
//Write a Kotlin program that creates a class 'Rectangle' with properties for width and height.
//Include a function to calculate the rectangle area.
class Rectangle(var width:Int, var height:Int){
    fun calculateArea():Int{
        return width * height
    }
}

//Maximum of Three Numbers: Write a Kotlin function that takes three numbers
// as parameters and returns the maximum of the three. Print the result.
fun findMaxNumber(numbers: List<Int>): Int{
    var maxNumber = numbers[0]
    for(number in numbers){
        if (number > maxNumber){
            maxNumber = number
        }
    }
    return maxNumber
}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//carry(people: Int) : Prints out "Carrying $people passengers" if the number of people is within its capacity else it prints
// out "Over capacity by $x people" where x is the number of people exceeding its capacity
class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if(people <= capacity){
            println("Carrying $people pasengers")
        }
        else{
            var excess = people - capacity
            println("Over capacity by $excess people")
        }
    }
//     identity() : Prints out the color, make and model in the following format e.g:  "I am a white subaru legacy
    fun identity(){
        println("I am a $color $model $make")
    }
//    calculateParkingFees(hours: Int) : Calculates and returns the parking fees by multiplying the hours by 20
    fun calculateParkingFees(hours:Int){
        var fees = hours * 20
    }
}