package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(true,"Jeff");
        dog.DockedTail();
        dog.MakeSound();
        dog.PlayFetch();
        dog.PrintName();
        Cat cat = new Cat("Kitty");
        cat.MakeSound();
        cat.SeeLaser();
        cat.BeHappy();
        cat.SeeLaser();
        cat.PrintName();
        Animal animal = new Animal("Bird", "Berb");
        animal.MakeSound();
        animal.PrintName();
        Garfield garfield = new Garfield();
        garfield.BeHappy();
        garfield.LayOnLap();
        garfield.MakeSound();
        garfield.SeeLaser();
        garfield.PrintName();
        OrangeTabby orangeTabby = new OrangeTabby("Jorb");
        orangeTabby.LayOnLap();
        orangeTabby.BeHappy();
        orangeTabby.MakeSound();
        orangeTabby.PrintName();
        orangeTabby.SeeLaser();
        RussianBlue russianBlue = new RussianBlue("Jerb");
        russianBlue.SeeLaser();
        russianBlue.BeHappy();
        russianBlue.MakeSound();
        russianBlue.PrintName();
    }
}
