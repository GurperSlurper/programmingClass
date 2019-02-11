package com.company;

/**
 * Created by jr8800 on 2/5/2019.
 */
public class Cat {
    private String species;
    private String name;

    public Cat(String name){

        this.name = name;
    }

    public void MakeSound(){
        System.out.println("Meow");
    }

    public void PrintName(){
        System.out.println(name);
    }

    public void BeHappy(){
        System.out.println("Purrrr");
        SeeLaser();
        MakeSound();
    }

    public void SeeLaser(){
        System.out.println("*Cat pounces*");
    }
}
