package com.example.myapplication

fun main(){

    var i = 0
/*
    //Break
    while (i < 4){
        println(i)
        i++


        if(i == 2){
            println("Encontré el 2")
            break
        }
    }
    */

    while(i < 4){

        if(i == 2){
            println("Soy el i del if y valgo..." + i)
            i++
            //println("Soy el i del if y valgo..." + i)
            continue
        }
        println("Soy el i del while y valgo..." + i)
    i++

    }
    /*
    * while (condicion){
    *   Bloque a ejecutar
    * }
    *
    * */

}
