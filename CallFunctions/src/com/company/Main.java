package com.company;

public class Main {

    public static void main(String[] args) {
        MyFunction1();
        Function2();
        Function3();
        ExampleFunction4();
        TestFunction5();
        Function2();
        Function2();
        ExampleFunction4();
        Function2();
        TestFunction5();
    }

    static void MyFunction1(){
        System.out.println("Printing stuff");
        System.out.println("Here is more stuff to print");
    }

    static void Function2(){
        System.out.println("Hello");
        System.out.println("World");
    }

    static void Function3(){
        System.out.println("This is fun");
        System.out.println("No it is not");
    }

    static void ExampleFunction4(){
        System.out.println("Why did the Scarecrow get a promotion?");
        System.out.println("because he was out standing in his field!");
    }

    static void TestFunction5(){
        System.out.println("Why do chicken coops only have two doors?");
        System.out.println("Because if they had four, they would be chicken sedans!");
    }
}
