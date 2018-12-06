package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Test if input is not number
        //Test if input is negative
        //Test if input is the same
        //Test to see if the numbers come out correctly
        //Test to see that the right amount of numbers comes out
        Scanner scanner = new Scanner(System.in);
        int usrIn = 0;
        int usrInTwo = 0;
        //Makes variables for  user input and a scanner to take it in

        System.out.println("Enter a number");
        //Asks user for a number

        while (true) {
            try {
                usrIn = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException ex) {
                System.out.println("Not a valid number");
                break;
            }

            if (usrIn <= 0){
                System.out.println("Not a valid number");
                break;
            }
            //Tests if user has an invalid input

            System.out.println("Enter a number");
            //Asks user for a second number

            while (true){
                try{
                    usrInTwo = Integer.parseInt(scanner.nextLine());
                }
                catch (NumberFormatException ex){
                    System.out.println("Not a valid number");
                    break;
                }

                if (usrInTwo <= 0){
                    System.out.println("Not a valid number");
                    break;
                }
                //Tests if user has an invalid input

                int min = 0;
                int max = 0;
                //Creates variables to sort user inputs into

                if (usrIn < usrInTwo) {
                        min = usrIn;
                        max = usrInTwo;
                }

                else if (usrIn > usrInTwo) {
                        min = usrInTwo;
                        max = usrIn;
                }
                //Checks which of the two inputs is higher and sorts accordingly

                if (min == max){
                    System.out.println("Numbers are the same");
                    return;
                }
                //Tests if the user's inputs are the same

                while (max >= min) {
                    boolean flag = false;

                    if (min == 1){
                        flag = true;
                    }
                    //1 is not a prime number

                    for (int i = 2; i <= min / 2; i++) {

                        if (min % i == 0) {
                            flag = true;
                            break;
                        }
                    }
                    //Checks if number is divisible by its half, no number is divisible by more than its half, so if its not its prime

                    if (!flag) {
                        System.out.println(min);
                    }
                    //Prints

                    min++;
                    //Runs loop
                }
            }
        }
    }
}
