package EnemySuper;

import ItemsSuper.Item;

import java.util.ArrayList;

public abstract class Enemy {

    private String name;
    private double HP;
    private double attackValue;
    private ArrayList<Item> items;

    public Enemy(String name, double HP, double attackValue) {
        this.name = name;
        this.HP = HP;
        this.attackValue = attackValue;
        this.items = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
