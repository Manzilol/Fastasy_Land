import HealSuper.Heal;
import HealSuper.HealType.HealingHands;
import ItemsSuper.Item;
import PlayerSuper.PlayerType.HealerType.Druid;
import PlayerSuper.RaceType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DruidTest {

    Druid druid;
    HealingHands healingHands;
    ArrayList<Item> items;

    @Before
    public void setUp(){
        druid = new Druid("Druid Dave", 100.00, RaceType.DARK_ELF, healingHands);
    }

    @Test
    public void hasName(){assertEquals("Druid Dave", druid.getName());
    }

    @Test
    public void hasHP(){assertEquals(100.00, druid.getHP(), 0.0);
    }

    @Test
    public void hasRace(){assertEquals(RaceType.DARK_ELF, druid.getRace());
    }

    @Test
    public void hasHeal(){assertEquals(healingHands, druid.getHeal());
    }
}
