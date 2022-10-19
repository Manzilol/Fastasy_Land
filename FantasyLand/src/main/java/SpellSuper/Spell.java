package SpellSuper;

import Interfaces.ISpell;

public abstract class Spell implements ISpell {

    private String name;

    private double attackValue;

    public Spell(String name, double attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public double getAttackValue() {
        return attackValue;
    }
}
