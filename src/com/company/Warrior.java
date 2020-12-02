package com.company;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
    }

    public Warrior(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
        System.out.println("Warrior ability: Critical damage ");

    }
}
