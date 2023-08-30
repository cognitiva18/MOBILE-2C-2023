package com.example.myapplication


//fun es una Función en Kotlin, o un método si está dentro de una clase.

/*
*
*
* Las variables pueden contener: letras, digitos, guiones bajos, y signos peso ($)
* Deben empezar con una letra
* Utilizar camelCase siempre que sea posible.
* */

fun main(){

    var miVariable = "Carlos Gomez" // Variable tipo String ----> PUEDEN MODIFICARSE EN TIEMPO DE EJECUACION
    val fechaNac = 1975             //Valor tipo entero (int) ----> NO SE PUEDEN MODIFICAR EN TIEMPO DE EJECUCION

    println("La variable es: " + miVariable)

    println(fechaNac)

    var nombre: String = "Tommy "
    var apellido: String = "Rojo"
    var direccion: String
    var edad: Double


    miVariable = "Federico Lacroze"

    println(miVariable)

    val pi = 3.14151692
    println(pi)
    println(nombre + apellido)
    
}
