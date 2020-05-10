import Components.InstrumentTypes;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar gibson;

    @Before
    public void before() {
        gibson = new Guitar("Red", "Wood", InstrumentTypes.STRINGS, 100, 150, 6);
    }

    @Test
    public void basicTests() {
        assertEquals("Red", gibson.getColour());
        assertEquals("Wood", gibson.getMaterial());
        assertEquals(InstrumentTypes.STRINGS, gibson.getType());
        assertEquals(100, gibson.getBuyPrice());
        assertEquals(150, gibson.getSellPrice());
        assertEquals(6, gibson.getNoOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum", gibson.play());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(50, gibson.calcMarkup());
    }
}
