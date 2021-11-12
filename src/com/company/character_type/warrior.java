package com.company.character_type;


import com.company.Archetype;

public class warrior extends Archetype{

    public warrior(String name, int attack, int health, int initities) {
        super(name, attack, health, initities);
    }

    public static class stats {

        private static String name;
        private static int attack;
        private static int health;
        private static int initities;


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

        public String toString() {
            System.out.println("This is the caracter statistics : \n");
            System.out.println("Name : " + warrior.stats.getName() + "\n");
            System.out.println("Attack : " + warrior.stats.getAttack() + "\n");
            System.out.println("Health : " + warrior.stats.getHealth() + "\n");
            System.out.println("Initities : " + warrior.stats.getInitities() + "\n");
            return "";
        }

        public static void warrior_class() {
            stats.name ="";
            stats.attack = 40;
            stats.health = 800;
            stats.initities = 30;
        }
    }
}