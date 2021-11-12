package com.company.character_type;


import com.company.Archetype;

public class wizard extends Archetype {

    public wizard(String name, int attack, int health, int initities) {
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
            System.out.println("Name : " + wizard.stats.getName() + "\n");
            System.out.println("Attack : " + wizard.stats.getAttack() + "\n");
            System.out.println("Health : " + wizard.stats.getHealth() + "\n");
            System.out.println("Initities : " + wizard.stats.getInitities() + "\n");
            return "";
        }

        public static int mage_class() {
            stats.attack = 70;
            stats.health = 200;
            stats.initities = 60;
            return 0;
        }
    }
}