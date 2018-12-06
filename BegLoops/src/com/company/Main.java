package com.company;

public class Main {

    public static void main(String[] args) {
	    int oneTen = 1;
	    int testLoop = 0;
	    int currentLoop = 1;

	    while (oneTen <= 10){
            System.out.println(oneTen);
            while (currentLoop <= 100){
                System.out.println("Current loop iteration: " + currentLoop);
                while (testLoop < 500){
                    System.out.println("Testing Loops" + testLoop);
                    testLoop++;
                }
                currentLoop++;
            }
            oneTen++;
        }
    }
}
