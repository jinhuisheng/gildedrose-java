package com.gildedrose.item;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.Assert.*;

public class BackstageItemTest {

    @Test
    public void 距离演出大于10天_每天更新_sellIn减1_quality加1() {
        BackstageItem backstageItem = new BackstageItem(11, 48);
        backstageItem.passOneDay();
        assertThat(backstageItem.sellIn).isEqualTo(10);
        assertThat(backstageItem.quality).isEqualTo(49);
    }

    @Test
    public void 距离演出等于10天_每天更新_sellIn减1_quality加2() {
        BackstageItem backstageItem = new BackstageItem(10, 48);
        backstageItem.passOneDay();
        assertThat(backstageItem.sellIn).isEqualTo(9);
        assertThat(backstageItem.quality).isEqualTo(50);
    }

//   TODO 距离演出小于10天,大于5天，每天更新，sellIn减1，quality加2
//   TODO 距离演出等于5天，每天更新，sellIn减1，quality加3
//   TODO 距离演出小于5天，每天更新，sellIn减1，quality加3
//   TODO 距离演出等于0天，每天更新，sellIn减1，quality置为0


}
