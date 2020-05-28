package com.peachou.kotlin.types.smartcasts;


import com.peachou.kotlin.types.smartcasts.java.Kotliner;
import com.peachou.kotlin.types.smartcasts.java.Person;

public class JavaCasts {
    public static void main(String... args) {


        Kotliner kotliner = new Person("benny", 20);
        if(kotliner instanceof Person){
            System.out.println(((Person) kotliner).name);
        }



    }
}


