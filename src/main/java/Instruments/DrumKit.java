package Instruments;

import Components.IPlay;
import Components.ISell;
import Components.InstrumentTypes;

public class DrumKit extends Instruments implements ISell, IPlay {
    private int noOfDrums;
    private int noOfCymbals;

    public DrumKit(String colour, String material, InstrumentTypes type, int buyPrice, int sellPrice, int noOfDrums, int noOfCymbals) {
        super(colour, material, type, buyPrice, sellPrice);
        this.noOfDrums = noOfDrums;
        this.noOfCymbals = noOfCymbals;


    }

    public int getNoOfDrums() {
        return noOfDrums;
    }

    public int getNoOfCymbals() {
        return noOfCymbals;
    }


    public String play() {
        return "Bang!";
    }

    public int calcMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
