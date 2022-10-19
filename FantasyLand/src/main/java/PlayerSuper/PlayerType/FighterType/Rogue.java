package PlayerSuper.PlayerType.FighterType;

import ItemsSuper.Item;
import PlayerSuper.PlayerType.Fighter;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public class Rogue extends Fighter {




    private ArrayList<Item> items;


    public Rogue(String name, Double HP, RaceType race) {
        super(name, HP,race);
        this.items = new ArrayList<Item>();

    }

}
