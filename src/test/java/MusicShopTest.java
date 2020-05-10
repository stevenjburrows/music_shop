import Components.ISell;
import Components.InstrumentTypes;
import Instruments.Guitar;
import Instruments.Piano;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    private MusicShop musicShop;
    private ISell sheetMusic;
    private ISell piano;
    private ISell guitar;

    @Before
    public void before(){
        guitar = new Guitar("Red", "Composite", InstrumentTypes.STRINGS, 100, 150, 6);
        musicShop = new MusicShop("Ray's Music Exchange");
        piano = new Piano("Black", "Wood", InstrumentTypes.PERCUSSION, 100, 150, 88);
        sheetMusic = new SheetMusic("Beethoven", 3, 10);
        musicShop.addStock(guitar);
        musicShop.addStock(piano);
        musicShop.addStock(sheetMusic);
    }

    @Test
    public void canGetName() {
        assertEquals("Ray's Music Exchange", musicShop.getName());
    }

    @Test
    public void canAddStock() {

        assertEquals(3, musicShop.getStock().size());
    }

    @Test
    public void canCalcPotentialProfit() {
        assertEquals(107, musicShop.calcPotentialProfit());
    }
}
