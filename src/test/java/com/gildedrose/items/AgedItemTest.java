package com.gildedrose.items;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.Assert.*;

public class AgedItemTest {
    @Test
    public void 未过期_quality_每天加1() {
        AgedItem agedItem = new AgedItem(1, 1);
        agedItem.passOneDay();
        assertThat(agedItem.sellIn).isEqualTo(0);
        assertThat(agedItem.quality).isEqualTo(2);
    }

    @Test
    public void 已过期_quality_每天加2() {
        AgedItem agedItem = new AgedItem(0, 1);
        agedItem.passOneDay();
        assertThat(agedItem.sellIn).isEqualTo(-1);
        assertThat(agedItem.quality).isEqualTo(3);
    }

    @Test
    public void quality_不会超过50() {
        AgedItem agedItem = new AgedItem(0, 50);
        agedItem.passOneDay();
        assertThat(agedItem.sellIn).isEqualTo(-1);
        assertThat(agedItem.quality).isEqualTo(50);
    }
}
