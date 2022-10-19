package PlayerSuper;

import ItemsSuper.Item;
import WeaponSuper.Weapon;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private double HP;
    private RaceType race;

    private Weapon weapon;

public Player(String name , double HP, RaceType race){
    this.name = name;
    this.HP= HP;
    this.race = race;
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = race;
    }
}
