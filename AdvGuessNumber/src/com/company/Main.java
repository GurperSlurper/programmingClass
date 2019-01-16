package com.company;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //public static String userName = Name(); //Asks for a name from the user
   // public  static int secretNumber = GenerateNumber(); //Generates number
   // public static int userGuessedNumber = GetGuess(); //Gets a number from the user
   public static int userAttempt = 1; //Initializes the user attempt counter
    public static String checkIn;// Used in IsUserValid function, input of

    //Test for Name left empty
    //Test for non number entered to guess
    //Test for bellow 0 entered into guess
    //Test all functions work as desired
    //Test all outputs

    public static void main(String[] args) {
        CheckGuess(); //Runs the check guess function
    }

    public static String Input(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String usrIn = scanner.nextLine();
        checkIn = usrIn;
       // IsUserValid();
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
            int usrGuessCheck = usrGuessIn;
            if (usrGuessIn <= 0 || usrGuessIn > 100) {
                System.out.println("Not a valid number");
                continue;
            }
            return usrGuessIn;
        }
    }//Calls IntInput. Checks to make sure number isn't 0 or below 0

    public static void printHint(){
        if (userGuessedNumber < secretNumber){
            System.out.println("Number was too small");
        }
        if (userGuessedNumber > secretNumber){
            System.out.println("Number was too large");
        }
    }//Function that tells the user if their number was too high or too low

    public static boolean(int theSectretNum, int usrGuessedNum){
        boolean trueGuess = false;
        if (theSectretNum != usrGuessedNum){
            userAttempt++;
            printHint();
        }
        else if (theSectretNum == usrGuessedNum){
            System.out.println("Good job! You got it correct in " + userAttempt + " attempt(s)!");
        }


    }

    public static boolean CheckGuess2(){
        boolean trueGuess = false;
        if (userGuessedNumber != secretNumber){
            trueGuess = false;
            userAttempt++;
            printHint();
            userGuessedNumber = GetGuess();
            CheckGuess2();
        }//Checks if the guess is not equal to the RNG. Adds to user attempt counter. Resets usrGuessedNumber and runs it. Re-runs CheckGuess

        else if (userGuessedNumber == secretNumber){
            trueGuess = true;
            System.out.println("Good job " + userName + "! You got it correct in " + userAttempt + " attempt(s)!");
            String check = PlayAgain();//Runs PlayAgain function
            if (check.equalsIgnoreCase("yes") || check.equalsIgnoreCase("y")){
                Game();
            }//If user answers yes to PlayAgain then runs Game function
            else if (check.equalsIgnoreCase("no") || check.equalsIgnoreCase("n")){
                System.out.println("Goodbye");
                System.exit(0);
            }//If user answers no to PlayAgain ends code
        }//Checks if the guess is same as RNG. Tells the user they got it right and in how many attempts.
        return trueGuess;
    }

    public static String PlayAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again?");
        String usrRply = scanner.nextLine();
        if (usrRply.isEmpty()){
            System.out.println("Field empty");
            PlayAgain();
        }//Makes sure the Play again field is filled
        else if (!usrRply.equalsIgnoreCase("y") & !usrRply.equalsIgnoreCase("n") & !usrRply.equalsIgnoreCase("yes") & !usrRply.equalsIgnoreCase("no")){
            System.out.println("Not a valid response");
            PlayAgain();
        }//Makes sure it is a valid response
        return usrRply;
    }//Asks the user if they want to play again

    public static void Game(){
        userName = Name();
        userAttempt = 0;
        secretNumber = GenerateNumber();
        userGuessedNumber = GetGuess();
        CheckGuess();
    }//Runs like main, but can be called

    public static String Name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        if (name.isEmpty()){
            System.out.println("Field is empty");
            Name();
        }
        return name;
    }//Function for holding names
}