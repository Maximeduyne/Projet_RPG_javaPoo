package com.company;

import com.company.Main;
import com.company.character_type.warrior;

class listcaracter extends Main {

    public String Archetype_warrior(String name, int attack, int health, int initities) {
        String Archetype1 = Archetype_warrior("warrior", 20, 100, 20);
        System.out.println(Archetype1);
        return Archetype1;
    }

    public String Archetype_thief(String name, int attack, int health, int initities) {
        String Archetype2 = Archetype_thief("thief",20,100,20);
        System.out.println(Archetype2);
        return Archetype2;
    }

    public String Archetype_mage(String name, int attack, int health, int initities) {
        String Archetype3 = Archetype_mage("mage",20,100,20);
        System.out.println(Archetype3);
        return Archetype3;
    }


}