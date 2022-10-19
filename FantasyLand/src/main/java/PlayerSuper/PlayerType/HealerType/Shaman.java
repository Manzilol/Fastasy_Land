package PlayerSuper.PlayerType.HealerType;

import ItemsSuper.Items;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public class Shaman extends Healer {


    private ArrayList<Item> items;


    public Shaman(String name, Double HP, RaceType race) {
        super(name, HP,race);
        this.items = new ArrayList<Item>();


    }

}
