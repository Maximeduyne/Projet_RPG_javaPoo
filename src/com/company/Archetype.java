package com.company;

import java.util.Scanner;


public class Archetype {
    public static class stats {

        private static String name;
        private static int attack;
        private static int health;
        private static int initities;

        public stats(String name, int attack, int health, int initities) {
            this.name = "" + name;
            this.attack = attack;
            this.health = health;
            this.initities = initities;
        }


        public static String getName() {
            return name;
        }

        public static int getAttack() {
            return stats.attack;
        }

        public static int getHealth() {
            return stats.health;
        }

        public static int getInitities() {
            return stats.initities;
        }

    }

    public String toString() {
        System.out.println("This is the caracter statistics : \n");
        System.out.println("Name : " + stats.getName() + "\n");
        System.out.println("Attack : " + stats.getAttack() + "\n");
        System.out.println("Health : " + stats.getHealth() + "\n");
        System.out.println("Initities : " + stats.getInitities() + "\n");
        return "";
    }

    public static String player1() {
        return null;
    }

    public static boolean player2() {
        return false;
    }

    public static void return_menu() {
        System.out.println("Pour retourner au menu tapez : 10");
        java.util.Scanner rt;
        rt = new Scanner(System.in);
        int retour = Integer.parseInt(rt.nextLine());
        if (retour == 10) {
            Main.menu();
            Main.jeu();
            }
        }
    }