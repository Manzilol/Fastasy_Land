package PlayerSuper.PlayerType.HealerType;

import HealSuper.Heal;
import ItemsSuper.Item;
import PlayerSuper.PlayerType.Healer;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public class Druid extends Healer {


    private ArrayList<Item> items;


    public Druid(String name, Double HP, RaceType race, Heal heal) {
        super(name, HP, race, heal);
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }


}
