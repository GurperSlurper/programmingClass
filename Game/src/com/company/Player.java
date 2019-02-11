package com.company;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by jr8800 on 2/11/2019.
 */
public class Player {
    private String name;
    private int level;
    private int experience;
    private Inventory inventory;
    private Wallet wallet;
    private int  health;
    private int defense;
    private int attack;
    private Random rand;

    public Player(){
        name = "Default";
        level = 1;
        experience = 0;
        inventory = new Inventory();
        wallet = new Wallet();
        rand = new Random();
        health = 50;
        defense = 10;
        attack = 10;
    }

    public Player(String name){
        this.name = name;
        level = 1;
        experience = 0;
        inventory = new Inventory();
        wallet = new Wallet();
        rand = new Random();
        health = 50;
        defense = 10;
        attack = 10;
    }

    public void checkWallet(){
        wallet.printAmount();
    }

    public int getXp() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    private int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    //used to get input from the user will allow them to see stats use heal or attack
    public void menu(Enemy enemy){
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do? heal or attack or stats");

            String answer = console.nextLine();

            if (answer.equalsIgnoreCase("stats")) {
                System.out.println("your stats:");
                System.out.println("level:   " + getLevel());
                System.out.println("health:  " + getHealth());
                System.out.println("attack:  " + getAttack());
                System.out.println("defense: " + getDefense());
                System.out.println("enemy stats:");
                System.out.println("health:  " + enemy.getHealth());
                System.out.println("attack:  " + enemy.getAttack());
                System.out.println("defense: " + enemy.getDefense());
            }
        }
    }

    //this is the function that allows the player to take damage
    //returns true if player is alive
    public boolean takeDamage(Enemy enemy){
        int damage = (rand.nextInt(enemy.getAttack())+enemy.getAttack()) - defense;
        if (damage<1){
            damage = 1;
        }
        health = health -damage;
        System.out.println("the enemy attacked you and you took: " + damage+ " damage!");
        if(isAlive()){
            return  true;
        }
        System.out.println("you died.");
        return false;
    }

    //returns true if the player health>0
    private boolean isAlive(){
        return (health>0);
    }

    //call to use a health potion
    /*private void heal(){
        if(healthPotions >0){
            healthPotions--;
            health = health +50;
            System.out.println("you drank one potion and restored 50 health, you now have "+health+" health");
        }
        else{
            System.out.println("you have no health potions");
        }
    }
    */

    public void gainXP(){
        experience++;
        //if they leveled up
        if (experience>(int) (5*Math.pow(1.3,level))){
            level++;
            System.out.println("you are now level: " + level);
            attack = attack +rand.nextInt(7)+1;
            defense = defense + rand.nextInt(7)+1;
        }
    }


}
