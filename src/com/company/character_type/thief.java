package com.company.character_type;


import com.company.Archetype;

public class thief {

    public static class stats {

        private static String name;
        private static int attack;
        private static int health;
        private static int initities;

        public stats(String name, int attack, int health, int initities) {

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

        public String toString() {
            System.out.println("This is the caracter statistics : \n");
            System.out.println("Name : " + thief.stats.getName() + "\n");
            System.out.println("Attack : " + thief.stats.getAttack() + "\n");
            System.out.println("Health : " + thief.stats.getHealth() + "\n");
            System.out.println("Initities : " + thief.stats.getInitities() + "\n");
            return "";
        }

        public static int thief_class() {
            stats.attack = 60;
            stats.health = 300;
            stats.initities = 90;
            return 0;
        }
    }
}