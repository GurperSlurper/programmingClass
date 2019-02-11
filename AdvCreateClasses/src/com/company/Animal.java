package com.company;

/**
 * Created by jr8800 on 2/5/2019.
 */
public class Animal {
    private String species;
    private String name;

    public Animal(String species, String name){
        this.species = species;
        this.name = name;
    }

    public void MakeSound(){
        System.out.println("Grrr");
    }

    public void PrintName(){
        System.out.println(name);
    }
}
