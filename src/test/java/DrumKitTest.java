import Components.InstrumentTypes;
import Instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {
    
    private DrumKit drumKit;

    @Before
    public void before() {
        drumKit = new DrumKit("Black", "various", InstrumentTypes.PERCUSSION, 100, 150, 5,3);
    }

    @Test
    public void basicTests() {
        assertEquals("Black", drumKit.getColour());
        assertEquals("various", drumKit.getMaterial());
        assertEquals(InstrumentTypes.PERCUSSION, drumKit.getType());
        assertEquals(100, drumKit.getBuyPrice());
        assertEquals(150, drumKit.getSellPrice());
        assertEquals(5, drumKit.getNoOfDrums());
        assertEquals(3, drumKit.getNoOfCymbals());
    }

    @Test
    public void canPlay() {
        assertEquals("Bang!", drumKit.play());
    }

    @Test
    public void canCalcMarkup() {
        assertEquals(50, drumKit.calcMarkup());
    }
}
