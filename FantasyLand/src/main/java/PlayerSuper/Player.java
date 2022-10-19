package PlayerSuper;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private double health;
    private ArrayList<Items> items;

public Player(String name , double health){
    this.name = name;
    this.health = health;
    this.items = new ArrayList<Items>();
}




}
