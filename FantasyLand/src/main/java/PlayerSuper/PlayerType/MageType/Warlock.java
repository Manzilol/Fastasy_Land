package PlayerSuper.PlayerType.MageType;

import ItemsSuper.Item;
import PlayerSuper.PlayerType.Mage;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public class Warlock extends Mage {



    private ArrayList<Item> items;


    public Warlock(String name, Double HP, RaceType race) {
        super(name, HP,race);
        this.items = new ArrayList<Item>();


    }

}
