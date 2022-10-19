package PlayerSuper.PlayerType;

import ItemsSuper.Item;
import PlayerSuper.RaceType;
import

import java.util.ArrayList;

public abstract class Fighter extends PlayerSuper.Player {




    public Fighter(String name, Double HP,RaceType race , ArrayList<Item> items ) {
        super(name, HP, race);


    }

}