package com.example.myapplication

fun main(){

    var x: Int
    var y: Int
    var z: Int

    x = 20
    y = 20
    z = 90

    if(x == y){

        println("Verdadadero")
        x = 30
    }

    if(x == y){
        println("Verdadadero")
    }else{
        println("Falso")
        y = 40
    }

    if(x != y || z < 50){

        println("X es diferente de Y")
        x = 30
    }

    if(x != y && z < 50){

        println("X es diferente de Y")
        x = 30
    } else {

        println("NO SE CUMPLE LA CONDICION")
    }

    if(x <= 30){

        println("X es menor o igual a 30")

    }

    val dia = 5

    val resultado = when(dia) {

        1-> "Lunes"
        2-> "Martes"
        3-> "Miercoles"
        4-> "Jueves"
        5-> "Viernes"
        6-> "Sabado"
        7-> "Domingo"
        else -> "Dia invalido"

    }

    println(resultado)
}
