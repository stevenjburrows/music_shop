package Instruments;

import Components.IPlay;
import Components.ISell;
import Components.InstrumentTypes;

public class Saxaphone extends Instruments implements ISell, IPlay {

    private int noOfKeys;

    public Saxaphone(String colour, String material, InstrumentTypes type, int buyPrice, int sellPrice, int noOfKeys) {
        super(colour, material, type, buyPrice, sellPrice);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }

    public String play() {
        return "Sax";
    }

    public int calcMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
