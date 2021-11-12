package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.WeakHashMap;

import com.company.character_type.*;


public class Main{

    public static void main(String[] args) {
        System.out.println("Application has started");
        menu();
    }

    public static void menu(){

        boolean game = true;

        while (game = true){
            System.out.println("""
                Choice :\s
                1 : Play
                2 : How To Play ?\s
                3 : Quit""");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            String player1;
            String name_character;

            switch (choice) {
                case 1:
                    System.out.println("1: Creation of the character"
                            + "\n2: Fight");
                    new Scanner(System.in);
                    int create_fight = sc.nextInt();
                    List myList = new ArrayList();
                    if (create_fight == 1) {
                        System.out.println("Create Character"
                                + "\nEnter your name");
                        Scanner name = new Scanner(System.in);
                        name_character = name.nextLine();
                        System.out.println("""
                            What class do you want to choose for your character ?
                            1 - Warrior
                            2 - Mage
                            3 - Thief\s
                            4 - Information of the characters
                            """);
                        int characters = sc.nextInt();
                        if (characters == 1) {
                            player1 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + warrior.stats.getAttack() + "\n" +
                                    "Health = " + warrior.stats.getHealth() + "\n" +
                                    "Initiative = " + warrior.stats.getInitities();
                            warrior warrior = new warrior(name_character, 30, 150, 10);
                            myList.add(warrior);
                            System.out.println(warrior);

                        } else if (characters == 2) {
                            player1 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + wizard.stats.getAttack() + "\n" +
                                    "Health = " + wizard.stats.getHealth() + "\n" +
                                    "Initiative = " + wizard.stats.getInitities();

                            wizard wizard = new wizard(name_character, 50, 100, 20);
                            myList.add(wizard);
                            System.out.println(wizard);
                        } else if (characters == 3) {

                            player1 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + thief.stats.getAttack() + "\n" +
                                    "Health = " + thief.stats.getHealth() + "\n" +
                                    "Initiative = " + thief.stats.getInitities();
                            thief thief = new thief(name_character, 20, 100, 40);
                            myList.add(thief);
                            System.out.println(thief);
                        }

                        if (create_fight == 2) {
                            //FIGHT
                            boolean win = false;
                            while (!win) {

                                if (Archetype.getHealth() > 0 && Archetype.getplayer2hp() > 0) {
                                    System.out.println(Archetype.getName());
                                    Archetype.getdamage();
                                    if (Archetype.getplayer2hp() > 0 && Archetype.getplayer2hp() > 0) {
                                        System.out.println("monster");
                                        Archetype.getplayerdmg();
                                        System.out.println("\n");
                                    }
                                } else {
                                    win = true;
                                    System.out.println("You win");
                                }
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("""
                        How To Play the Game ?
                        
                        In this turn based game you have to attack your opponent using\s
                        your abilities and your skills\s
                        which will be given to you at the start of the game,\s
                        the remaining living player wins the game!\s""");

                    break;

                case 3:
                    System.out.println("You select the option Quit");
                    System.exit(0);

                default:
                    System.out.println("You choice an invalid option");

            }
        }


    }
}