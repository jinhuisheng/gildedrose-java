package com.gildedrose.item;

public class BackstageItem extends Item {
    public BackstageItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (isRemainingTenDays()) {
            increaseQuality();
        }
        if (isRemainingFiveDays()) {
            increaseQuality();
        }
        if (isExpired()) {
            setQualityToZero();
        }
    }

    private boolean isRemainingFiveDays() {
        return sellIn < 6;
    }

    private boolean isRemainingTenDays() {
        return sellIn < 11;
    }

    private void setQualityToZero() {
        quality = 0;
    }
}
