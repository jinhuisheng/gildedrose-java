package com.gildedrose.items;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.Assert.*;

public class BackstageItemTest {

    @Test
    public void 距离演出大于10天_quality_每天加1() {
        BackstageItem backstageItem = new BackstageItem(11, 1);
        backstageItem.passOneDay();
        assertThat(backstageItem.sellIn).isEqualTo(10);
        assertThat(backstageItem.quality).isEqualTo(2);
    }

    @Test
    public void 距离演出小于等于10天_并且大于5天_quality_每天加2() {
        BackstageItem backstageItem = new BackstageItem(10, 1);
        backstageItem.passOneDay();
        assertThat(backstageItem.sellIn).isEqualTo(9);
        assertThat(backstageItem.quality).isEqualTo(3);
    }
    @Test
    public void 距离演出小于等于5天_quality_每天加3() {
        BackstageItem backstageItem = new BackstageItem(5, 1);
        backstageItem.passOneDay();
        assertThat(backstageItem.sellIn).isEqualTo(4);
        assertThat(backstageItem.quality).isEqualTo(4);
    }

    @Test
    public void 演出过期_quality_变为0() {
        BackstageItem backstageItem = new BackstageItem(0, 1);
        backstageItem.passOneDay();
        assertThat(backstageItem.sellIn).isEqualTo(-1);
        assertThat(backstageItem.quality).isEqualTo(0);
    }
}
