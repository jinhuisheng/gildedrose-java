package com.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ItemTest {

    @Test
    public void 未过期_quality_and_sellIn_每天减1() {
        Item normal = new Item("Normal", 1, 1);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(0);
        assertThat(normal.quality).isEqualTo(0);
    }

    @Test
    public void 已过期_quality_每天减2() {
        Item normal = new Item("Normal", 0, 2);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(-1);
        assertThat(normal.quality).isEqualTo(0);
    }

    @Test
    public void quality_不会小于0() {
        Item normal = new Item("Normal", 0, 0);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(-1);
        assertThat(normal.quality).isEqualTo(0);
    }
}
