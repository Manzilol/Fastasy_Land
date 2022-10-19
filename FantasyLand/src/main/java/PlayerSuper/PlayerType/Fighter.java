package PlayerSuper.PlayerType;

import ItemsSuper.Item;
import PlayerSuper.Player;
import PlayerSuper.RaceType;
import WeaponSuper.Weapon;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private Weapon weapon;

    public Fighter(String name, Double HP, RaceType race, Weapon weapon) {
        super(name, HP, race);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}