package com.company;
import java.util.Scanner;

public class Main extends Archetype{

    public static void main(String[] args) {
        jeu();
    }

    public static void jeu(){
        System.out.println("Application has started");
        System.out.println("Choice : ");
        System.out.println("1 : Choice / Modify Character");
        System.out.println("2 : Play");
        System.out.println("3 : Quit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1: Creation of the character");
                System.out.println("2: Modification of the character");
                new Scanner(System.in);
                int create_modify = sc.nextInt();
                switch (create_modify) {
                    case 1 -> {
                        System.out.println("Create Character");
                        Scanner name = new Scanner(System.in);
                        String name_character = name.nextLine();
                        stats.getName();
                        Scanner attack = new Scanner(System.in);
                        int attack_character = attack.nextInt();
                        stats.getAttack();
                        Scanner health = new Scanner(System.in);
                        int health_character = health.nextInt();
                        stats.getHealth();
                        Scanner initiative = new Scanner(System.in);
                        int initiative_character = initiative.nextInt();
                        stats.getInitities();
                        System.out.println("You character is created" + " \n" +
                                "The name is " + name_character + "\n" +
                                "Attack = " + attack_character + "\n" +
                                "Health = " + health_character + "\n" +
                                "Initiative = " + initiative_character);
                        player2();
                        int players_damage = health_character - attack_character;
                        System.out.println("The player inflict  " + attack_character + "point of damage");
                        System.out.println("The player has now " + players_damage + " pv");
                    }
                    case 2 -> System.out.println("Custom your Character already created");
                }
                break;
            case 2:
                System.out.println("PLAY");
                break;
            case 3:
                System.out.println("You select the option Quit");
            default:
                System.out.println("You choice an invalid option");
        }
    }

}