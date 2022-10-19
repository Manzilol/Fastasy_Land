package PlayerSuper.PlayerType.MageType;

import ItemsSuper.Item;
import PlayerSuper.PlayerType.Mage;
import PlayerSuper.RaceType;
import SpellSuper.Spell;

import java.util.ArrayList;

public class Warlock extends Mage {



    private ArrayList<Item> items;


    public Warlock(String name, Double HP, RaceType race, Spell spell) {
        super(name, HP, race, spell);
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

}
