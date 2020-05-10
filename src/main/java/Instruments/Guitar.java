package Instruments;

import Components.IPlay;
import Components.ISell;
import Components.InstrumentTypes;

public class Guitar extends Instruments implements IPlay, ISell {

    private int NoOfStrings;

    public Guitar(String colour, String material, InstrumentTypes type, int buyPrice, int sellPrice, int noOfStrings) {
        super(colour, material, type, buyPrice, sellPrice);
        NoOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return NoOfStrings;
    }

    public String play() {
        return "Strum";
    }

    public int calcMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
