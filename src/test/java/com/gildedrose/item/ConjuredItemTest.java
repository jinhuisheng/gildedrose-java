package com.gildedrose.item;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConjuredItemTest {

    //   TODO 已过保，每天更新，quality减4
//   TODO 已过保，每天更新，每天更新，quality不会小于0
    @Test
    public void 未过保_每天更新_sellIn减一_quality都减2() {
        ConjuredItem conjuredItem = new ConjuredItem(1, 3);
        conjuredItem.passOneDay();
        assertThat(conjuredItem.sellIn).isEqualTo(0);
        assertThat(conjuredItem.quality).isEqualTo(1);
    }

    @Test
    public void 未过保_每天更新_quality不会小于0() {
        ConjuredItem conjuredItem = new ConjuredItem(1, 1);
        conjuredItem.passOneDay();
        assertThat(conjuredItem.sellIn).isEqualTo(0);
        assertThat(conjuredItem.quality).isEqualTo(0);
    }

    @Test
    public void 已过保_每天更新_quality都减4() {
        ConjuredItem conjuredItem = new ConjuredItem(0, 5);
        conjuredItem.passOneDay();
        assertThat(conjuredItem.sellIn).isEqualTo(-1);
        assertThat(conjuredItem.quality).isEqualTo(1);
    }

    @Test
    public void 已过保_每天更新_quality不会小于0() {
        ConjuredItem conjuredItem = new ConjuredItem(0, 3);
        conjuredItem.passOneDay();
        assertThat(conjuredItem.sellIn).isEqualTo(-1);
        assertThat(conjuredItem.quality).isEqualTo(0);
    }

}
