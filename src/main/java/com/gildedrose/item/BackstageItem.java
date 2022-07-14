package com.gildedrose.item;

public class BackstageItem extends Item {
    public BackstageItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
     public void updateQuality() {
        increaseQuality();
        if (tenDaysRemained()) {
            increaseQuality();
        }
        if (fiveDaysRemained()) {
            increaseQuality();
        }
        if (expired()) {
            updateQualityAfterExpired();
        }
    }

    private boolean fiveDaysRemained() {
        return sellIn < 6;
    }

    private boolean tenDaysRemained() {
        return sellIn < 11;
    }

    private void updateQualityAfterExpired() {
        quality = 0;
    }

}
