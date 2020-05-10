import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    private SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Beethoven", 3, 10);
    }

    @Test
    public void basicTests() {
        assertEquals("Beethoven", sheetMusic.getName());
        assertEquals(3, sheetMusic.getBuyPrice());
        assertEquals(10,sheetMusic.getSellPrice());

    }
    public void calcMarkup() {
        assertEquals(7, sheetMusic.calcMarkup());
    }
}
