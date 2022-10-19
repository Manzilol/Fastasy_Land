package PlayerSuper.PlayerType;

import ItemsSuper.Items;
import PlayerSuper.RaceType;

import java.util.ArrayList;

public abstract class Fighter extends PlayerSuper.Player {




    public Fighter(String name, Double HP,RaceType race , ArrayList<Items> items ) {
        super(name, HP, race,items);


    }

}