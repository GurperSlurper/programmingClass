package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Test for Name left empty
    //Test for non number entered to guess
    //Test for bellow 0 entered into guess
    //Test all functions work as desired
    //Test all outputs

    public static void main(String[] args) {
       while (true) {
           boolean looper = false;
           String usrName = Name();//Asks for name
           int theSecretNum = GenerateNumber();//Creates RNG
           int usrAttempt = 1;//Initializes the user attempts
           while (looper == false) {
               boolean check = CheckGuess(GetGuess(), theSecretNum);// asks for user guess
               if (check == true) {
                   System.out.println("Good job " + usrName + "! You got it in " + usrAttempt + " tries!");
                   boolean checkAgain = PlayAgain();//If the user got it right asks if the want to play again
                   if (checkAgain == true) {
                       looper = true;//Returns to main loop
                   }
                   if (checkAgain == false){
                       System.out.println("Goodbye");
                       System.exit(0);//exits
                   }
               }
               else if (check == false) {
                   usrAttempt++;
                   continue;//returns to nested loop
               }
               continue;//returns to main loop
           }
       }
    }

    public static String Input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String usrIn = scanner.nextLine();
        return usrIn;
    }//Function that asks for the user input. Runs a check to make sure that the input is valid

    public static int IntInput(String prompt2){
        int usrIntIn = 0;
        while (true) {
            try {
                usrIntIn = Integer.parseInt(Input(prompt2));
                return usrIntIn;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input");
                continue;
            }
        }
        //usrIntIn = checkOut;
    }//Calls to Input

    public static int GenerateNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;
    }//Random number function

    public static int GetGuess(){
        int usrGuessIn = 0;
        while (true) {
            usrGuessIn = IntInput("Enter a number between 1-100");
            if (usrGuessIn <= 0 || usrGuessIn > 100) {
                System.out.println("Not a valid number");
                continue;
            }

            return usrGuessIn;
        }
    }//Calls IntInput. Checks to make sure number isn't 0 or below 0

    public static void printHint(int userGuessedNum, int theSecretNum){
        if (userGuessedNum < theSecretNum){
            System.out.println("Number was too small");
        }
        if (userGuessedNum > theSecretNum){
            System.out.println("Number was too large");
        }
    }//Function that tells the user if their number was too high or too low

    public static boolean CheckGuess (int theSectretNum, int usrGuessedNum){
        boolean trueGuess = false;
        if (theSectretNum != usrGuessedNum){
            printHint(theSectretNum, usrGuessedNum);
        }
        if (theSectretNum == usrGuessedNum){
            trueGuess = true;
        }
        return trueGuess;
    }//Checks if the user's guess is correct

    public static boolean PlayAgain(){
        boolean check = false;
        while (true) {
            String usrRply = Input("Do you want to play again?");
            if (usrRply.equalsIgnoreCase("yes") || usrRply.equalsIgnoreCase("y")) {
                check = true;
            }
            if (usrRply.equalsIgnoreCase("no") || usrRply.equalsIgnoreCase("n")) {
                check = false;
            }
            if (!usrRply.equalsIgnoreCase("no") & !usrRply.equalsIgnoreCase("n") & !usrRply.equalsIgnoreCase("yes") & !usrRply.equalsIgnoreCase("y")) {
                System.out.println("Invalid input");
                continue;
            }
            return check;
        }
    }//Asks the user if they want to play again

    public static String Name(){
        while (true) {
            String usrName = Input("Enter a name");
            if (usrName.isEmpty()) {
                System.out.println("Field is empty");
                continue;
            }
            return usrName;
        }
    }//Function for holding names
}