package com.gildedrose.item;

public class ConjuredItem extends Item {
    public ConjuredItem(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        doubleDecreaseQuality();
        if (isExpired()) {
            doubleDecreaseQuality();
        }
    }

    private void doubleDecreaseQuality() {
        decreaseQuality();
        decreaseQuality();
    }
}
