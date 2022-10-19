package Enemy;

import java.util.ArrayList;

public abstract class Enemy {

    private String name;
    private double HP;
    private double attackValue;
    private ArrayList<items> items;

    public Enemy(String name, double HP, double attackValue) {
        this.name = name;
        this.HP = HP;
        this.attackValue = attackValue;
        this.items = items;
    }
    

    public String getName() {
        return name;
    }

    public double getHP() {
        return HP;
    }

    public ArrayList<items> getItems() {
        return items;
    }
}
