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
    @Before
    public void setUp(){
        knight = new Knight("Sir Donkey Balls", 100.00, RaceType.HUMAN, sword);
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
}



