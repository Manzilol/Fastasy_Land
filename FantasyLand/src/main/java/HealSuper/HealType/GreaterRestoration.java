package HealSuper.HealType;

import HealSuper.Heal;
import PlayerSuper.Player;

public class GreaterRestoration extends Heal {

    public GreaterRestoration(double healingValue) {
        super(healingValue);
    }

    @Override
    public void heal(Player player) {
        double newPlayerHP = player.getHP() + getHealingValue();
        player.setHP(newPlayerHP);
    }
}
