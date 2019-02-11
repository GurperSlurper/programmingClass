package com.company;

/**
 * Created by jr8800 on 2/8/2019.
 */
public class RussianBlue {
    private String species;
    private String name;

    public RussianBlue(String name){
        this.name = name;
        species = "cat";
    }

    public void MakeSound(){
        System.out.println("Hisss");
    }

    public void PrintName(){
        System.out.println("Name");
    }

    public void BeHappy(){
        System.out.println("Purrrr");
        SeeLaser();
    }

    public void SeeLaser(){
        System.out.println("*Cat pounces*");
    }
}
