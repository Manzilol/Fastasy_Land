import EnemySuper.EnemyType.Goblin;
import PlayerSuper.PlayerType.MageType.Wizard;
import PlayerSuper.RaceType;
import SpellSuper.SpellType.Rot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Rot rot;
    Goblin goblin;

    @Before

    public void setUp(){
        rot = new Rot(10);
        wizard = new Wizard("Albus Dumbledore", 200.00, RaceType.HUMAN, rot);
        goblin = new Goblin("Gobbles", 20, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Albus Dumbledore", wizard.getName());}

    @Test
    public void hasHP() {
        assertEquals(200.00, wizard.getHP(), 0.0);}

    @Test
    public void hasRace() {
        assertEquals(RaceType.HUMAN, wizard.getRace());}

    @Test
    public void hasSpell() {
        assertEquals(rot, wizard.getSpell());}

    @Test
    public void canAttack() {
        wizard.attackWithSpell(goblin);
        assertEquals(10, goblin.getHP(), 0.0);
    }
}
