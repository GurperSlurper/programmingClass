package com.company;

/**
 * Created by jr8800 on 2/11/2019.
 */
public class Wallet {
    private Money money = new Money();
    private int balance;

    public Wallet(){
        balance = 0;
    }

    public void addGold(int amount){
        balance = balance + money.gold()*amount;
    }

    public void addSilver(int amount){
        balance = balance + money.silver()*amount;
    }

    public void addCopper(int amount){
        balance = balance + money.copper()*amount;
    }

    public void printAmount(){
        System.out.println(balance);
    }
}
