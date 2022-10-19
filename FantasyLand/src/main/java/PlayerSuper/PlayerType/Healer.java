package PlayerSuper.PlayerType;

import ItemsSuper.Items;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public abstract class Healer extends PlayerSuper.Player {


    public Healer(String name, Double HP, RaceType race , ArrayList<Items> items) {
        super(name, HP, race,items);


    }

}
