package com.gildedrose.item;

public class AgedItem extends Item {
    public AgedItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (isExpired()) {
            increaseQuality();
        }
    }

}
