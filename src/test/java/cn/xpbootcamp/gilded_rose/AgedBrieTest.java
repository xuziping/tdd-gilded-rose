package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.domain.entity.AgedBrieGoods;
import cn.xpbootcamp.gilded_rose.domain.entity.Goods;
import com.spun.util.Asserts;
import org.junit.jupiter.api.Test;

public class AgedBrieTest {

    private static final Integer OVER_SELLIN_DAYS = 50;

    @Test
    public void quality_is_higher_by_days() {
        Goods goods = new AgedBrieGoods();
        int previousQuality = goods.getOriginalQuality();
        for (int days = 1; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            int currentQuality = goods.calQuality(days);
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), currentQuality >= previousQuality);
            previousQuality = currentQuality;
        }
    }
}
