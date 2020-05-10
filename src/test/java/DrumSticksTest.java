import Items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    
    private DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Wood", 3, 10);
    }

    @Test
    public void basicTests() {
        assertEquals("Wood", drumSticks.getName());
        assertEquals(3, drumSticks.getBuyPrice());
        assertEquals(10,drumSticks.getSellPrice());

    }
    public void calcMarkup() {
        assertEquals(7, drumSticks.calcMarkup());
    }
}

