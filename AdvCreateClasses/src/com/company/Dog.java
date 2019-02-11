package com.company;

/**
 * Created by jr8800 on 2/5/2019.
 */
public class Dog {
    private String species;
    private String name;
    private boolean dockedTail;

    public Dog(boolean dockedTail, String name){
        species = "Dog";
        this.name = name;
        this.dockedTail = dockedTail;
    }

    public void MakeSound(){
        System.out.println("Woof");
    }

    public void PrintName(){
        System.out.println(name);
    }

    public void DockedTail(){
        System.out.println(dockedTail);
    }

    public void PlayFetch(){
        System.out.println("*Chases ball 5 times then quits*");
    }
}
