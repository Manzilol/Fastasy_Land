package HealSuper;

import Interfaces.IHeal;
import PlayerSuper.Player;

public abstract class Heal implements IHeal {

    private double healingValue;

    public Heal(double healingValue) {
        this.healingValue = healingValue;
    }


    public double getHealingValue() {
        return healingValue;
    }


}
