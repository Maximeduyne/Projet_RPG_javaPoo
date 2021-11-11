package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Archetype{

    public static void main(String[] args) {
        System.out.println("Application has started");
        menu();
        jeu();
    }

    public static void menu(){
        System.out.println("Choice : ");
        System.out.println("1 : Create / Choice / Modify Character");
        System.out.println("2 : Play");
        System.out.println("3 : Quit");
    }
    public static void jeu(){

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1: Creation of the character");
                System.out.println("2: Modification of the character");
                System.out.println("3: Take the default caracter");
                new Scanner(System.in);
                int create_modify = sc.nextInt();
                if (create_modify == 1 ) {
                    System.out.println("Create Character");
                    System.out.println("Enter your name");
                    Scanner name = new Scanner(System.in);
                    String name_character = name.nextLine();
                    stats.getName();
                    System.out.println("Enter your attack");
                    Scanner attack = new Scanner(System.in);
                    int attack_character = attack.nextInt();
                    stats.getAttack();
                    System.out.println("Enter your health");
                    Scanner health = new Scanner(System.in);
                    int health_character = health.nextInt();
                    stats.getHealth();
                    System.out.println("Enter your Initities");
                    Scanner initiative = new Scanner(System.in);
                    int initiative_character = initiative.nextInt();
                    stats.getInitities();
                    String perso_create;
                    perso_create = "You character is created" + " \n" +
                            "The name is " + name_character + "\n" +
                            "Attack = " + attack_character + "\n" +
                            "Health = " + health_character + "\n" +
                            "Initiative = " + initiative_character;
                    // <<dammage>>
                    // int players_damage = health_character - attack_character;
                    // System.out.println("The player inflict  " + attack_character + "point of damage");
                    // System.out.println("The player has now " + players_damage + " pv");
                    // liste pour stocker les personnages crÃ©es
                    // List<listcaracter> myList = new ArrayList();
                    System.out.println(perso_create);
                    return_menu();

                }
                if (create_modify ==2) {
                    System.out.println("Custom your Character already created");
                    return_menu();
                }
                if (create_modify==3) {
                    System.out.println("Default caracter");
                    player2();
                    return_menu();
                }

            case 2:
                //FIGHT
                boolean fight = true;
                boolean win = false;
                while (fight){

                    boolean choice_fight = false;
                    while (choice_fight){
                        System.out.println("1 - Attack");
                        int choice_fight2 = sc.nextInt();

                        if (choice_fight2 == 1){

                        }
                    }
                }


                break;
            case 3:
                System.out.println("You select the option Quit");
            default:
                System.out.println("You choice an invalid option");
        }
    }

}