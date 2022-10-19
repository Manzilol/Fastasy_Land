import ItemsSuper.Item;
import PlayerSuper.PlayerType.HealerType.Druid;
import PlayerSuper.RaceType;
import org.junit.Before;

import java.util.ArrayList;

public class DruidTest {



    Druid druid;

    ArrayList<Item> items;

    @Before
    public void before(){
        ArrayList<Item> items = new ArrayList<>();
        druid = new Druid("Teddy", 50.0, RaceType.ELF);


    }
}
