import PlayerSuper.PlayerType.MageType.Wizard;
import PlayerSuper.RaceType;
import SpellSuper.SpellType.Rot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Rot rot;

    @Before
    public void setUp(){
        wizard = new Wizard("Albus Dumbledore", 200.00, RaceType.HUMAN, rot);
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

}
