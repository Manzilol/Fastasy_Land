package PlayerSuper.PlayerType;

import PlayerSuper.RaceType;

public abstract class Fighter extends PlayerSuper.Player {




    public Fighter(String name, Double health,RaceType race , ArrayList<Items>items ) {
        super(name, health, race,items);


    }

}