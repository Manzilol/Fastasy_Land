package SpellSuper;

import Interfaces.ISpell;

public abstract class Spell implements ISpell {


    private double attackValue;

    public Spell(double attackValue) {
        this.attackValue = attackValue;
    }


    public double getAttackValue() {
        return attackValue;
    }
}
