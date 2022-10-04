package com.gildedrose.item;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ItemTest {

    @Test
    public void 未过保_每天更新_sellIn和quality都减1() {
        Item normal = new Item("normal", 2, 3);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(1);
        assertThat(normal.quality).isEqualTo(2);
    }

    @Test
    public void 已过保_每天更新_quality减2() {
        Item normal = new Item("normal", 0, 3);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(-1);
        assertThat(normal.quality).isEqualTo(1);
    }

    @Test
    public void 未过保_每天更新_quality不会小于0() {
        Item normal = new Item("normal", 2, 0);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(1);
        assertThat(normal.quality).isEqualTo(0);
    }

    @Test
    public void 已过保_每天更新_quality不会小于0() {
        Item normal = new Item("normal", -1, 0);
        normal.passOneDay();
        assertThat(normal.sellIn).isEqualTo(-2);
        assertThat(normal.quality).isEqualTo(0);
    }

}
