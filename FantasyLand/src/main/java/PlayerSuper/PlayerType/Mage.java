package PlayerSuper.PlayerType;

import ItemsSuper.Items;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public abstract class Mage extends PlayerSuper.Player{



    public Mage(String name, Double HP, RaceType race , ArrayList<Items> items) {
        super(name, HP,race,items);


    }
}
