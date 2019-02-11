package com.company;

public class Animal {

    String species;
    String name;
    String color;
    int age;

    public Animal(String color, String name, String species){
        this.color = color;
        this.name = name;
        this.species = species;
        age = 0;
    }

    public void MakeSound(){
        System.out.println("Grrrrr");
    }

    public void SetAge(int newAge){
        age = newAge;
    }

    public void PrintDescription(){
        System.out.println(name + " is a " + age + " year(s) old " + color + " " + species);
    }
}
