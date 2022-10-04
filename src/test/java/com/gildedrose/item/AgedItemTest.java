package com.gildedrose.item;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.Assert.*;

public class AgedItemTest {

    @Test
    public void 未过保_每天更新_quality加1() {
        AgedItem agedItem = new AgedItem(10, 49);
        agedItem.passOneDay();
        assertThat(agedItem.sellIn).isEqualTo(9);
        assertThat(agedItem.quality).isEqualTo(50);
    }

    @Test
    public void 未过保_每天更新_quality不会超过50() {
        AgedItem agedItem = new AgedItem(10, 50);
        agedItem.passOneDay();
        assertThat(agedItem.quality).isEqualTo(50);
    }

    @Test
    public void 已过保_每天更新_quality加2() {
        AgedItem agedItem = new AgedItem(-1, 48);
        agedItem.passOneDay();
        assertThat(agedItem.quality).isEqualTo(50);
    }

    @Test
    public void 已过保_每天更新_quality不会超过50() {
        AgedItem agedItem = new AgedItem(-1, 49);
        agedItem.passOneDay();
        assertThat(agedItem.quality).isEqualTo(50);
    }


}
