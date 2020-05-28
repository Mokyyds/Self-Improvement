package com.peachou.kotlin.types.smartcasts

import com.peachou.kotlin.types.smartcasts.kotlin.Kotliner
import com.peachou.kotlin.types.smartcasts.kotlin.Person

var tag: String? = null

fun main() {

//    if(tag != null){
//        println(tag.length)
//    }









    val kotliner: Kotliner = Person("benny", 20)
    if(kotliner is Person){
        println((kotliner as? Person)?.name)
    }












    var value: String? = null
    value = "benny"
    if(value != null){
        println(value.length)
    }

}

