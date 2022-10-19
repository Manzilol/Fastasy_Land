package SpellSuper;

public abstract class Spell implements iSpell{

    private String name;

    private double attackValue;

    public Spell(String name, double attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public double Attack(){
        return this.attackValue;
    }


}
