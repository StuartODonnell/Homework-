import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle testWaterBottle;

    @Before
    public void before() {

        testWaterBottle = new WaterBottle();
    }

    @Test
        public void testGetVolume(){
        assertEquals(100, testWaterBottle.getVolume());

        }

        @Test
    public void testTakeDrink(){
        testWaterBottle.takeDrink();
        assertEquals(90, testWaterBottle.getVolume());
        }

        @Test
    public void testEmptyBottle(){
        testWaterBottle.emptyBottle();
        assertEquals(0, testWaterBottle.getVolume());

        }

    @Test
    public void testFillBottle(){
        testWaterBottle.fillBottle();
        assertEquals(100, testWaterBottle.getVolume());

    }

    }




//    Water Bottle
//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.









