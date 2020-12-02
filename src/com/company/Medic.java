package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
    }

    public Medic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
        System.out.println("Medic ability: health recovery ");
    }
}
