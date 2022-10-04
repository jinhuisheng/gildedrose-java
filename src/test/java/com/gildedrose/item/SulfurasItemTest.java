package com.gildedrose.item;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.Assert.*;

public class SulfurasItemTest {

    @Test
    public void 每天更新_sellIn和quality不变() {
        SulfurasItem sulfurasItem = new SulfurasItem(1, 1);
        assertThat(sulfurasItem.sellIn).isEqualTo(1);
        assertThat(sulfurasItem.quality).isEqualTo(1);
    }
}
