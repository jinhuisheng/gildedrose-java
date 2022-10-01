package com.gildedrose.items;

import com.gildedrose.Item;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConjuredItemTest {
    @Test
    public void 未过期_quality_每天减2() {
        ConjuredItem normal = new ConjuredItem(3, 10);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(2);
        assertThat(normal.quality).isEqualTo(8);
    }

    @Test
    public void 已过期_quality_每天减4() {
        Item normal = new ConjuredItem(0, 10);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(-1);
        assertThat(normal.quality).isEqualTo(6);
    }

}
