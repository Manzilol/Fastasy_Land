package WeaponSuper;

public abstract class Weapon implements iWeapon{

    private String name;

    private double attackValue;

    public Weapon(String name, double attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public double Attack(){
        return this.attackValue;
    }
}
