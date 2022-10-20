package WeaponSuper.WeaponType;

import EnemySuper.Enemy;
import WeaponSuper.Weapon;

public class Axe extends Weapon {

    public Axe(String name, double attackValue) {
        super(name, attackValue);
    }

    @Override
    public void attack(Enemy enemy) {
        double newEnemyHP = enemy.getHP() - getAttackValue();
        enemy.setHP(newEnemyHP);
    }
}
