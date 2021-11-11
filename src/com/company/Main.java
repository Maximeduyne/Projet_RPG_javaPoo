package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.company.character_type.warrior;
import com.company.character_type.mage;
import com.company.character_type.thief;


public class Main extends Archetype{

    public static void main(String[] args) {
        System.out.println("Application has started");
        menu();
        jeu();
    }

    public static void menu(){
        System.out.println("Choice : ");
        System.out.println("1 : Play");
        System.out.println("2 : How To Play ? ");
        System.out.println("3 : Quit");
    }
    public static void jeu(){

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String player1 = "";
        String player2 = "";
        switch (choice) {
            case 1:
                System.out.println("1: Creation of the character");
                System.out.println("2: Fight");
                new Scanner(System.in);
                int create_fight = sc.nextInt();
                List myList = new ArrayList();
                if (create_fight == 1 ) {
                    System.out.println("Create Character");
                    System.out.println("Enter your name");
                    Scanner name = new Scanner(System.in);
                    String name_character = name.nextLine();
                    stats.getName();
                    System.out.println("What class did you want to peak for your character for fight?");
                    System.out.println("1 : Warrior");
                    System.out.println("2 : Mage");
                    System.out.println("3 : Thief");
                    System.out.println("4 : Information of the characters");
                    int characters = sc.nextInt();
                    if (characters ==1){
                        warrior.stats.warrior_class();
                        if (player1 == ""){
                            player1 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + warrior.stats.getAttack() + "\n" +
                                    "Health = " + warrior.stats.getHealth()+ "\n" +
                                    "Initiative = " + warrior.stats.getInitities() ;
                            myList.add(player1);
                        }
                        else if (player2 ==""){
                            player2 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + warrior.stats.getAttack() + "\n" +
                                    "Health = " + warrior.stats.getHealth()+ "\n" +
                                    "Initiative = " + warrior.stats.getInitities() ;
                            myList.add(player2);
                        }
                    }
                    else if (characters ==2){
                        mage.stats.mage_class();
                        if (player1 == ""){
                            player1 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + mage.stats.getAttack() + "\n" +
                                    "Health = " + mage.stats.getHealth()+ "\n" +
                                    "Initiative = " + mage.stats.getInitities() ;
                            myList.add(player1);
                        }
                        else if (player2 ==""){
                            player2 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + mage.stats.getAttack() + "\n" +
                                    "Health = " + mage.stats.getHealth()+ "\n" +
                                    "Initiative = " + mage.stats.getInitities() ;
                            myList.add(player2);
                        }
                    }
                    else if (characters ==3){
                        thief.stats.thief_class();
                        if (player1 ==""){
                            player1 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + thief.stats.getAttack() + "\n" +
                                    "Health = " + thief.stats.getHealth()+ "\n" +
                                    "Initiative = " + thief.stats.getInitities() ;
                            myList.add(player1);
                        }
                        else if (player2 ==""){
                            player2 = "You character is created" + " \n" +
                                    "The name is " + name_character + "\n" +
                                    "Attack = " + thief.stats.getAttack() + "\n" +
                                    "Health = " + thief.stats.getHealth()+ "\n" +
                                    "Initiative = " + thief.stats.getInitities() ;
                            myList.add(player2);
                        }
                    }
                    else if (characters == 4){
                        System.out.println("Warrior : ");
                        System.out.println("Mage : ");
                        System.out.println("Thief : ");
                    }
                    System.out.println(myList);
                    return_menu();
                }

                if (create_fight == 2) {
                    //FIGHT
                    boolean fight = true;
                    boolean win = false;

                    while (fight){

                        boolean choice_fight = false;
                        while (choice_fight){
                            int players_damage = stats.getHealth() - stats.getAttack();
                            System.out.println("The player inflict  " + stats.getAttack() + "point of damage");
                            System.out.println("The player has now " + players_damage + " pv");
                            }
                        }
                    }

            case 2:
                System.out.println("How To Play the Game ?");
                System.out.println("In this turn based game you have to attack your opponent using \n" +
                        "your abilities and your skills \n" +
                        "which will be given to you at the start of the game, \n" +
                        "the remaining living player wins the game! ");
                return_menu();
                break;

            case 3:
                System.out.println("You select the option Quit");
                System.exit(0);

            default:
                System.out.println("You choice an invalid option");

        }
    }

}