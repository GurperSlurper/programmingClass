package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOfUser usrArr = new ArrayOfUser();

        while (true) {
            System.out.println("Would you like to create account or login?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Login")) {
                boolean check = usrArr.Login();
                if (check == false){
                    continue;
                }
                if (check == true){
                    return;
                }
            }
            if (answer.equalsIgnoreCase("Create account") || answer.equalsIgnoreCase("Create")) {
                usrArr.CreateUser();
            }
            else {
                System.out.println("That is not a valid input. Try 'login' or 'create (account)'");
                continue;
            }
        }
    }
}