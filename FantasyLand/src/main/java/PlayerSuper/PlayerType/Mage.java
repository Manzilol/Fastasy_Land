package PlayerSuper.PlayerType;

import EnemySuper.Enemy;
import ItemsSuper.Item;
import PlayerSuper.Player;
import PlayerSuper.RaceType;
import SpellSuper.Spell;

import java.util.ArrayList;

public abstract class Mage extends Player{

    private Spell spell;
    public Mage(String name, Double HP, RaceType race, Spell spell) {
        super(name, HP, race);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void attackWithSpell(Enemy enemy){
        spell.cast(enemy);
    }
}
