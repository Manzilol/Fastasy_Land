package HealSuper;

public abstract class Heal extends iHeal {

    private String name;

    private double healingValue;

    public Heal(String name, double healingValue) {
        this.name = name;
        this.healingValue = healingValue;
    }

    public double Heal(){return this.healingValue;}
}
