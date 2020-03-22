package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.domain.entity.Goods;
import cn.xpbootcamp.gilded_rose.domain.entity.NormalGoods;
import com.spun.util.Asserts;
import org.junit.jupiter.api.Test;

public class NormalGoodsTest {

    private static final Integer OVER_SELLIN_DAYS = 50;

    @Test
    public void normal_goods_quality_double_down_after_sellin() {

        Goods goods = new NormalGoods();
        int dayIndex = goods.getSellIn();
        int previousQuality = goods.calQuality(dayIndex);
        int downQuality = goods.calQuality(dayIndex - 1) - previousQuality;
        for (dayIndex++; dayIndex < goods.getSellIn() + OVER_SELLIN_DAYS; dayIndex++) {
            int currentQuality = goods.calQuality(dayIndex);
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), dayIndex),
                (previousQuality-currentQuality) == downQuality * 2);
            previousQuality = currentQuality;
        }
    }
}
