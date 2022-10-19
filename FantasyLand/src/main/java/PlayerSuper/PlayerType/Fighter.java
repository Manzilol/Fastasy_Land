package PlayerSuper.PlayerType;

import Interfaces.IWeapon;
import ItemsSuper.Items;
import PlayerSuper.Player;
import PlayerSuper.RaceType;
import

import java.util.ArrayList;

    private WeaponType weaponType;

public abstract class Fighter extends Player {




    public Fighter(String name, Double HP,RaceType race , ArrayList<Items> items ) {
        super(name, HP, race,items);


    }

}