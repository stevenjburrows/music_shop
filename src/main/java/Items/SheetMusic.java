package Items;

import Components.ISell;

public class SheetMusic extends Items implements ISell {

    public SheetMusic(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }


    public int calcMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
