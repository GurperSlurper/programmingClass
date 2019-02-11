package com.company;

/**
 * Created by jr8800 on 2/5/2019.
 */
public class OrangeTabby {
    private String species;
    private String name;

    public OrangeTabby(String name){
        this.name = name;
        species = "cat";
    }

    public void MakeSound(){
        System.out.println("Meow");
    }

    public void PrintName(){
        System.out.println(name);
    }

    public void BeHappy(){
        LayOnLap();
        System.out.println("*Takes a nap*");
    }

    public void LayOnLap(){
        System.out.println("*Cuddles on owner's lap*");
    }

    public void SeeLaser(){
        System.out.println("*Cat pounces*");
    }
}
