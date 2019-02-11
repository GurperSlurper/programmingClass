package com.company;

/**
 * Created by jr8800 on 2/5/2019.
 */
public class Garfield {
    private String species;
    private String name;

    public Garfield(){
        species = "Cat";
        name = "Garfield";
    }

    public void MakeSound(){
        System.out.println("Mmmm, lasagna");
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
        BeHappy();
    }
}
