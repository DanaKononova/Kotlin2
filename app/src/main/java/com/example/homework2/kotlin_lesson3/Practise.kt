package com.example.homework2.kotlin_lesson3

fun main() {
    val printFIO: (String, String) -> Unit = { name, fio ->
        print("Меня зовут "+name+" "+fio)
    }
    printFIO("Dana", "Kononova")

    val printObj = object:Printable{
        override fun printFirstName(name : String) {
            print("First name $name" )
        }

        override fun printLastName(name : String) {
            print("Last name $name" )
        }

    }
    printObj.printFirstName("Dana")
}