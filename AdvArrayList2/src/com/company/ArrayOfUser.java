package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jr8800 on 3/19/2019.
 */
public class ArrayOfUser {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> usrNam = new ArrayList<String>();
    ArrayList<String> usrPass = new ArrayList<String>();

    public void CreateUser(){
        while (true) {
            System.out.println("Enter Username:");
            String name = scanner.nextLine();

            if (usrNam.contains(name)) {
                System.out.println("Username taken; please enter a new one");
                continue;
            }
            else {
                usrNam.add(name);
                System.out.println("Enter Password:");
            }

            String pass = scanner.nextLine();
            usrPass.add(pass);
            return;
        }
    }

    public boolean Login(){
        boolean usrLog;
        System.out.println("Enter Username:");
        while (true) {
            String name = scanner.nextLine();
            System.out.println("Enter Password:");
            String pass = scanner.nextLine();
            for(int i = 0; usrNam.size() >  i; i++) {

                if (name.equals(usrNam.get(i))){
                    if(pass.equals(usrPass.get(i))){
                        System.out.println("Welcome, " + name);
                        usrLog = true;
                        return usrLog;
                    }
                }
            }
            System.out.println("Sorry account does not match records");
            return false;
        }
    }
}
