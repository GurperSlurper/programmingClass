package com.company;

import com.sun.corba.se.impl.naming.cosnaming.NamingUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double usrBln = 0;
        int usrYrs = 0;
        double usrContr = 0;
        double avgReturn = 0;
        Scanner scanner = new Scanner(System.in);
        //Makes values and something to retrieve user input

        while (true) {

            System.out.println("Enter a starting balance in dollars");

            while (true) {

                try {
                    usrBln = Double.parseDouble(scanner.nextLine());
                }
                catch (NumberFormatException ex) {
                    System.out.println("Not a valid number");
                    break;
                }

                System.out.println("Enter yearly contributions");

                while (true) {

                    try {
                        usrContr = Double.parseDouble(scanner.nextLine());

                    }
                    catch (NumberFormatException ex) {
                        System.out.println("Not a valid number");
                        break;
                    }

                    System.out.println("Enter average return on investment as a %");

                    while (true) {

                        try {
                            avgReturn = Double.parseDouble(scanner.nextLine());
                        }
                        catch (NumberFormatException ex) {
                            System.out.println("Not a valid number");
                            break;
                        }

                        System.out.println("Enter number of years");

                        while (true) {

                            try {
                                usrYrs = Integer.parseInt(scanner.nextLine());
                            }
                            catch (NumberFormatException ex) {
                                System.out.println("Not a valid number");
                                break;
                            }

                            int timesRan = 0;
                            while (timesRan <= usrYrs) {
                                System.out.println("Year " + timesRan + ": " + usrBln);

                                usrBln = (usrBln + usrContr) * ((avgReturn / 100) + 1);

                                timesRan++;
                            }
                        }
                    }
                }
            }
        }
    }
}
