package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Application has started");
        System.out.println("1 --> Jouer");
        System.out.println("2 --> Quit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose to play");
                break;
            case 2:
                System.out.println("You chose to quit");
                break;
            default:
                System.out.println("You chose an invalid option");
        }


    }

}