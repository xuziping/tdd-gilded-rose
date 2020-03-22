package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.domain.entity.Goods;
import cn.xpbootcamp.gilded_rose.domain.entity.SulfurasGoods;
import com.spun.util.Asserts;
import org.junit.jupiter.api.Test;

public class SulfurasTest {

    private static final Integer OVER_SELLIN_DAYS = 50;

    @Test
    public void quality_should_no_change() {
        Goods goods = new SulfurasGoods();
        int dayIndex = 1;
        int previousQuality = goods.calQuality(1);
        for (dayIndex++; dayIndex < goods.getSellIn() + OVER_SELLIN_DAYS; dayIndex++) {
            int currentQuality = goods.calQuality(dayIndex);
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), dayIndex),
                currentQuality == previousQuality);
            previousQuality = currentQuality;
        }
    }
}
