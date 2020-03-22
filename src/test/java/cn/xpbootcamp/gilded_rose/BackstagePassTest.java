package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.domain.entity.BackstagePassGoods;
import cn.xpbootcamp.gilded_rose.domain.entity.Goods;
import com.spun.util.Asserts;
import org.junit.jupiter.api.Test;

public class BackstagePassTest {

    private static final Integer OVER_SELLIN_DAYS = 50;

    @Test
    public void quality_daily_plus_2_when_sellin_between_5_10_days() {
        Goods goods = new BackstagePassGoods();
        int dayIndex = goods.getSellIn() - 10;
        int previousQuality = goods.calQuality(dayIndex);
        for (dayIndex++; dayIndex < goods.getSellIn() - 5; dayIndex++) {
            int currentQuality = goods.calQuality(dayIndex);
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), dayIndex),
                currentQuality == previousQuality + 2);
            previousQuality = currentQuality;
        }
    }

    @Test
    public void quality_daily_plus_3_when_sellin_between_0_5_days() {
        Goods goods = new BackstagePassGoods();
        int dayIndex = goods.getSellIn() - 5;
        int previousQuality = goods.calQuality(dayIndex);
        for (dayIndex++; dayIndex <= goods.getSellIn(); dayIndex++) {
            int currentQuality = goods.calQuality(dayIndex);
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), dayIndex),
                currentQuality == previousQuality + 3);
            previousQuality = currentQuality;
        }
    }

    @Test
    public void quality_is_not_0_when_sellin() {
        Goods goods = new BackstagePassGoods();
        Asserts.assertTrue(String.format("%s after %d ", goods.getName(), goods.getSellIn()),
            goods.calQuality(goods.getSellIn()) > 0);
    }

    @Test
    public void quality_is_0_after_sellin() {
        Goods goods = new BackstagePassGoods();
        for (int days = goods.getSellIn() + 1; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) == 0);
        }
    }
}
