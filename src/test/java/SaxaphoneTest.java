import Components.InstrumentTypes;
import Instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    private Saxaphone sax;

    @Before
    public void before() {
        sax = new Saxaphone("Brass", "Brass", InstrumentTypes.WOODWIND, 100, 150, 5);
    }

    @Test
    public void basicTests() {
        assertEquals("Brass", sax.getColour());
        assertEquals("Brass", sax.getMaterial());
        assertEquals(InstrumentTypes.WOODWIND, sax.getType());
        assertEquals(100, sax.getBuyPrice());
        assertEquals(150, sax.getSellPrice());
        assertEquals(5, sax.getNoOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Sax", sax.play());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(50, sax.calcMarkup());
    }
}

