package com.gildedrose.items;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.Assert.*;

public class SulfurasItemTest {

    @Test
    public void quality_不变() {
        SulfurasItem sulfurasItem = new SulfurasItem(1, 1);
        sulfurasItem.passOneDay();
        assertThat(sulfurasItem.quality).isEqualTo(1);
        sulfurasItem.passOneDay();
        assertThat(sulfurasItem.quality).isEqualTo(1);
    }
}
