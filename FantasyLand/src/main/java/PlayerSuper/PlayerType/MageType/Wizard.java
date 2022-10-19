package PlayerSuper.PlayerType.MageType;

import ItemsSuper.Item;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public class Wizard extends PlayerSuper.PlayerType.Mage{

    private ArrayList<Item> items;


    public Wizard(String name, Double HP, RaceType race) {
        super(name, HP,race);
        this.items = new ArrayList<Item>();


    }

}
