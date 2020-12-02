package com.company;

public class Magic extends Hero {

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
    }

    public Magic(int health, int damage, String superAbility) {
        super(health, damage, superAbility);
        System.out.println("Magic ability: Blink dagger ");
    }
}
