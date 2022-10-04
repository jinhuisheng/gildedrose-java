package com.gildedrose.item;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void passOneDay() {
        updateQuality();
        updateSellIn();
    }

    protected void updateQuality() {
        decreaseQuality();
        if (isExpired()) {
            decreaseQuality();
        }
    }

    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    protected boolean isExpired() {
        return sellIn <= 0;
    }

    void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

}
