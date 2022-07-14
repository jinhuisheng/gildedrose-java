package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstageItem extends Item {
    public BackstageItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        if (isTenDaysRemained()) {
            increaseQuality();
        }
        if (isFiveDaysRemained()) {
            increaseQuality();
        }
        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    private boolean isFiveDaysRemained() {
        return sellIn < 6;
    }

    private boolean isTenDaysRemained() {
        return sellIn < 11;
    }

    private void updateQualityAfterExpiration() {
        quality = 0;
    }
}
