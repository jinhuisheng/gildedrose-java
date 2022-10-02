package com.gildedrose.item;

public class BackstageItem extends Item {
    public BackstageItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (isTenDaysBefore()) {
            increaseQuality();
        }
        if (isFiveDaysBefore()) {
            increaseQuality();
        }
        if (isExpired()) {
            setQualityToZero();
        }
    }

    private boolean isFiveDaysBefore() {
        return sellIn < 6;
    }

    private boolean isTenDaysBefore() {
        return sellIn < 11;
    }

    private void setQualityToZero() {
        quality = 0;
    }
}
