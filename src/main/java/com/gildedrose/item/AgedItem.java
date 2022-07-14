package com.gildedrose.item;

public class AgedItem extends Item {
    public AgedItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }


    @Override
    public void updateQuality() {
        increaseQuality();
        if (expired()) {
            increaseQuality();
        }
    }

}
