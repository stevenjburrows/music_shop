package Instruments;

import Components.InstrumentTypes;

public abstract class Instruments {

    private String colour;
    private String material;
    private InstrumentTypes type;
    private int buyPrice;
    private int sellPrice;

    public Instruments(String colour, String material, InstrumentTypes type, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentTypes getType() {
        return type;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
