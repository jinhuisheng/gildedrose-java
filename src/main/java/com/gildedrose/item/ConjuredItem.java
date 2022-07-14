package com.gildedrose.item;

public class ConjuredItem extends Item {
    public ConjuredItem(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decreaseQuality(2);
        if (expired()) {
            decreaseQuality(1);
        }
    }
}
