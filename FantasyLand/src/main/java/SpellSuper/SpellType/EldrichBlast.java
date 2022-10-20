package SpellSuper.SpellType;

import EnemySuper.Enemy;
import SpellSuper.Spell;

public class EldrichBlast extends Spell {

    public EldrichBlast(double attackValue) {
        super(attackValue);
    }

    @Override
    public void cast(Enemy enemy) {
        double newEnemyHP = enemy.getHP() - getAttackValue();
        enemy.setHP(newEnemyHP);
    }
}
