package com.company;

public class Main {

    public static void main(String[] args) {
        int X = Add(1,2);
        int Y = Sub(3,8);
        int Z = Add1(4);

        MyPrintFunction();
        BobPrinter();

        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);

    }

    static void MyPrintFunction(){
        System.out.println("In MyPrintFunction");
    }

    static void BobPrinter(){
        System.out.println("bob bob bob bob bob");
    }

    static int Add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    static int Sub(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    static int Add1(int num){
        num++;
        return num;
    }


}
