package com.gildedrose.items;

import com.gildedrose.Item;

public class ConjuredItem extends Item {
    public ConjuredItem(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        decreaseQuality();
        decreaseQuality();
        if (isExpired()) {
            decreaseQuality();
        }
    }
}
