package com.gildedrose.item;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        if (name.equals("Conjured Mana Cake")) {
            return new ConjuredItem(sellIn, quality);
        }
        return new Item(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void passOneDay() {
        decreaseSellIn();
        updateQuality();
    }

    protected void updateQuality() {
        decreaseQuality(1);
        if (expired()) {
            decreaseQuality(1);
        }
    }

    protected void decreaseQuality(int value) {
        if (quality > 0) {
            quality = quality - value;
        }
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected boolean expired() {
        return sellIn < 0;
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
