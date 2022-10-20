package HealSuper.HealType;

import HealSuper.Heal;
import PlayerSuper.Player;

public class HealingHands extends Heal {

    public HealingHands(double healingValue) {
        super(healingValue);
    }

    @Override
    public void heal(Player player) {
        double newPlayerHP = player.getHP() + getHealingValue();
        player.setHP(newPlayerHP);
    }
}
