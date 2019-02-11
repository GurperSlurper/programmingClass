package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Orange", "Jeff", "Tiger");

        animal.SetAge(5);

        animal.MakeSound();
        animal.PrintDescription();
    }
}
