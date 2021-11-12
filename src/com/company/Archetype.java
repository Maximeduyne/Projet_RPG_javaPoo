package com.company;

import java.util.Scanner;


public class Archetype extends Main {

    private static int player2dmg = 1;
    private static int player2hp = 1000;
    private static int player2init = 0;
    private static String name;
    private static int attack;
    private static int health;
    private static int initities;

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

    public static int getplayerdmg() {
        return player2dmg;
    }

    public static int getplayer2hp() {
        return player2hp;
    }

    public static int getplayerinit() {
        return player2init;
    }

    public static void getdamage() {
        health = health - attack;
        System.out.println("The player inflict  " + attack + "point of damage");
        System.out.println("You have now " + health + "pv");
    }

    public Archetype(String name, int attack, int health, int initities) {

        this.name = name;
        this.attack = attack;
        this.health = health;
        this.initities = initities;

    }

    public String toString() {
        System.out.println("This is the caracter statistics : \n");
        System.out.println("Name : " + name + "\n");
        System.out.println("Attack : " + attack + "\n");
        System.out.println("Health : " + health + "\n");
        System.out.println("Initities : " + initities + "\n");
        return "";
    }


    public static void player2damage() {
        player2hp = player2hp - player2dmg;
        System.out.println(player2dmg + " " + getName() + " damage");
        System.out.println(player2hp + " monster hp");
    }

}


