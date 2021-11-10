package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");
        System.out.println("1 --> Jouer");
        System.out.println("2 --> Quit");

        java.util.Scanner rt;
        String choix;
        Scanner sc = new Scanner(System.in);
        choix = sc.nextLine();

        if (choix == "1"){
            System.out.print("Lancement Du Jeu");
        }
        if (choix == "2"){
            System.out.print("Vous avez quitter le jeu");
        }
    }

    public static void message(){


    }
}