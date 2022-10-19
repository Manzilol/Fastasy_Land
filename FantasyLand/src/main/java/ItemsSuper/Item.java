package ItemsSuper;

public abstract class Item {

    private String name;
    private double healValue;

    public Item(String name, double healValue){
        this.name = name;
        this.healValue = healValue;
    }

    public String getName() {
        return name;
    }

    public double getHealValue() {
        return healValue;
    }
}
