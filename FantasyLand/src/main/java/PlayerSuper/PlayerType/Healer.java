package PlayerSuper.PlayerType;

import EnemySuper.Enemy;
import HealSuper.Heal;
import ItemsSuper.Item;
import PlayerSuper.Player;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private Heal heal;

    public Healer(String name, Double HP, RaceType race, Heal heal) {
        super(name, HP, race);
        this.heal = heal;
    }

    public Heal getHeal() {
        return heal;
    }

    public void setHeal(Heal heal) {
        this.heal = heal;
    }

    public void healWithSpell(Player player){
        heal.heal(player);
    }

}
