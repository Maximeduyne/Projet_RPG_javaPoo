package com.company;

public class Archetype {
    public static class stats {

        private static String name;
        private static int attack;
        private static int  health;
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
            return attack;
        }

        public static int getHealth() {
            return health;
        }

        public static int getInitities() {
            return initities;
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

}

