package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //most of this assignment is trying to read the existing code to understand how it works,
        //ask a classmate or instructor if you are unsure how the code works.
        Scanner scanner = new Scanner(System.in);


        //generate a new player
        Player player = new Player();
        //create main game loop that continues until the player has no health
        while (player.getHealth() > 0){
            Enemy enemy = new Enemy(player.getPlayerLevel());
            //generate a new enemy( the level of the enemy should be the player's level)
            while (player.getHealth() > 0 && enemy.getHealth() > 0) {
                //create battle loop that should continue while both the player and enemy are alive
                player.menu(enemy);
                //gets player's input on what to do (use one of the methods to do this)
                player.takeDamage(enemy);
                //has the player take damage
                enemy.takeDamage(player);
                //has the enemy take damage
            }
        }
        System.out.println("You died at level " + player.getPlayerLevel() + " with " + player.getXp() + " xp");
        //once the player is dead print out the player's level and how much xp they had.
    }
}
