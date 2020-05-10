package Instruments;

import Components.IPlay;
import Components.ISell;
import Components.InstrumentTypes;

public class Piano extends Instruments implements IPlay, ISell {

    private int noOfKeys;

    public Piano(String colour, String material, InstrumentTypes type, int buyPrice, int sellPrice, int noOfKeys) {
        super(colour, material, type, buyPrice, sellPrice);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }


    public String play() {
        return "Ting";
    }

    public int calcMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
