package com.company;
import java.util.Scanner;

public class Main extends Archetype{

    public static void main(String[] args) {
        jeu();
    }

    public static void jeu(){
        System.out.println("Application has started");
        System.out.println("Choice : ");
        System.out.println("1 : Choice / Modify Caracter");
        System.out.println("2 : Play");
        System.out.println("3 : Quit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1: Creation of the caracter");
                System.out.println("2: Modification of the caracter");
                Scanner nt = new Scanner(System.in);
                int create_modify = sc.nextInt();
                switch (create_modify){
                    case 1:
                        System.out.println("Create Caracter");
                        Scanner name = new Scanner(System.in);
                        String name_caracter = name.nextLine();
                        stats.getName();
                        Scanner attack = new Scanner(System.in);
                        int attack_caracter = attack.nextInt();
                        stats.getAttack();
                        Scanner health = new Scanner(System.in);
                        int health_caracter = health.nextInt();
                        stats.getHealth();
                        Scanner initiaties = new Scanner(System.in);
                        int initiaties_caracter = initiaties.nextInt();
                        stats.getInitities();

                        System.out.println("You caracter is created"+" \n" +
                                "The name is " + name_caracter + "\n" +
                                "Attack = " + attack_caracter + "\n" +
                                "Health = " + health_caracter + "\n" +
                                "Initities = " + initiaties_caracter );
                        break;
                    case 2:
                        System.out.println("Custom your Caracter already created");
                        break;
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