package ItemsSuper;

public abstract class Items {

    private String name;
    private double healValue;

    public Items(String name, double healValue){
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
