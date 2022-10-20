package SpellSuper.SpellType;

import EnemySuper.Enemy;
import SpellSuper.Spell;

public class Rot extends Spell {

    public Rot(double attackValue) {
        super(attackValue);
    }

    @Override
    public void cast(Enemy enemy) {
        double newEnemyHP = enemy.getHP() - getAttackValue();
        enemy.setHP(newEnemyHP);
    }
}
