package PlayerSuper.PlayerType;

import ItemsSuper.Item;
import PlayerSuper.Player;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public abstract class Fighter extends Player {

    private ArrayList<Item> items;


    public Fighter(String name, Double HP,RaceType race) {
        super(name, HP, race);
        this.items = new ArrayList<Item>();
    }

}