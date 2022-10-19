package PlayerSuper;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private double HP;
    private ArrayList<Items> items;

    private RaceType race;

public Player(String name , double HP, RaceType race,ArrayList<Item> items){
    this.name = name;
    this.HP= HP;
    this.race = race;
    this.items = new ArrayList<Items>();

}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = race;
    }
}
