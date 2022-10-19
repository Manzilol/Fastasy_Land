package PlayerSuper;

import ItemsSuper.Item;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private double HP;
    private ArrayList<Item> items;

    private RaceType race;

public Player(String name , double HP, RaceType race){
    this.name = name;
    this.HP= HP;
    this.race = race;
    this.items = new ArrayList<Item>();

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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = race;
    }
}
