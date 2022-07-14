package com.gildedrose.item;

public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void decreaseSellIn() {
    }

    @Override
    public void updateQuality() {
    }
}
