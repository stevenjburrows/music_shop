package Items;

import Components.ISell;

public class DrumSticks extends Items implements ISell {

    public DrumSticks(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }


    public int calcMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
