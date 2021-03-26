fun main() {
  val address1=Address("Gerardine",20)
    println("address name.${address1.name}")
    println("address age.${address1.age}")
    val address2=Address("Chantal",20)
    println("address name.${address2.name}")
    println("address age.${address2.age}")
    val address3=Address(age=59)
    println("address name.${address3.name}")
    println("address age.${address3.age}")
}

class Address(val name: String="No Name", var age: Int){

}