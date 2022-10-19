package PlayerSuper.PlayerType.FighterType;

import ItemsSuper.Item;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public class Knight extends Fighter{


    public Knight(String name, Double HP, RaceType race) {
        super(name, HP,race);
        this.items = new ArrayList<Item>();


    }

}
