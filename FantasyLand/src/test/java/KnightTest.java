import EnemySuper.Enemy;
import EnemySuper.EnemyType.Goblin;
import PlayerSuper.PlayerType.FighterType.Knight;
import PlayerSuper.RaceType;
import WeaponSuper.Weapon;
import WeaponSuper.WeaponType.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    public Knight knight;
    public Sword sword;
    public Goblin goblin;
    @Before
    public void setUp(){
        sword = new Sword("MeetCute", 10);
        knight = new Knight("Sir Donkey Balls", 100.00, RaceType.HUMAN, sword);
        goblin = new Goblin("Deez nuts", 20, 5);

    }

    @Test
    public void hasAName(){
        assertEquals("Sir Donkey Balls", knight.getName());
    }

    @Test
    public void hasHP() {
        assertEquals(100.00, knight.getHP(), 0.0);
    }

    @Test
    public void hasARace() {
        assertEquals(RaceType.HUMAN, knight.getRace());
    }

    @Test
    public void hasAWeapon(){
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void canAttack() {
        knight.attackWithWeapon(goblin);
        knight.attackWithWeapon(goblin);
        knight.attackWithWeapon(goblin);
        assertEquals(-10, goblin.getHP(), 0.0);
    }
}



