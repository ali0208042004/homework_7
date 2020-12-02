package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(200,500,"Blink dagger");
        Medic medic = new Medic(500,200,"Health recovery");
        Warrior warrior = new Warrior(1000,700,"Critical Damage");

        Hero [] heroes = new Hero[] {magic, medic, warrior };
        for (Hero i:heroes) {
        }
    }
}
