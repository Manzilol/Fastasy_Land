package HealSuper;

import Interfaces.IHeal;

public abstract class Heal implements IHeal {

    private String name;

    private double healingValue;

    public Heal(String name, double healingValue) {
        this.name = name;
        this.healingValue = healingValue;
    }

    public double Heal(){return this.healingValue;}
}
