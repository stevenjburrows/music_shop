import Components.InstrumentTypes;
import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    
    private Piano piano;

    @Before
    public void before() {
        piano = new Piano("Black", "Wood", InstrumentTypes.PERCUSSION, 100, 150, 88);
    }

    @Test
    public void basicTests() {
        assertEquals("Black", piano.getColour());
        assertEquals("Wood", piano.getMaterial());
        assertEquals(InstrumentTypes.PERCUSSION, piano.getType());
        assertEquals(100, piano.getBuyPrice());
        assertEquals(150, piano.getSellPrice());
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Ting", piano.play());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(50, piano.calcMarkup());
    }
}
