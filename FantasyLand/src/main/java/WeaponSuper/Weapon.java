package WeaponSuper;

import Interfaces.IWeapon;

public abstract class Weapon implements IWeapon {

    private String name;

    private double attackValue;

    public Weapon(String name, double attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }
}


