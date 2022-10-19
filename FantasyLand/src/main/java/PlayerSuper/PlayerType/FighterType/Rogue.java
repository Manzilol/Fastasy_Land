package PlayerSuper.PlayerType.FighterType;

import ItemsSuper.Item;
import PlayerSuper.PlayerType.Fighter;
import PlayerSuper.RaceType;
import WeaponSuper.Weapon;

import java.util.ArrayList;

public class Rogue extends Fighter {

    private ArrayList<Item> items;
    
    public Rogue(String name, Double HP, RaceType race, Weapon weapon) {
        super(name, HP, race, weapon);
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

}
