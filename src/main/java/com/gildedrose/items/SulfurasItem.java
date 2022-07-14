package com.gildedrose.items;

import com.gildedrose.Item;

public class SulfurasItem extends Item {
    public SulfurasItem(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected void decreaseSellIn() {

    }

    @Override
    protected void updateQuality() {
    }
}
