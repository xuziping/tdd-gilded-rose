package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.domain.entity.AgedBrieGoods;
import cn.xpbootcamp.gilded_rose.domain.entity.BackstagePassGoods;
import cn.xpbootcamp.gilded_rose.domain.entity.Goods;
import cn.xpbootcamp.gilded_rose.domain.entity.NormalGoods;
import cn.xpbootcamp.gilded_rose.domain.entity.SulfurasGoods;
import com.spun.util.Asserts;
import org.junit.jupiter.api.Test;

public class GoodsQualityRangeTest {

    private static final Integer OVER_SELLIN_DAYS = 50;

    @Test
    public void agedbrie_quality_should_not_less_than_0() {
        Goods goods = new AgedBrieGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) >= 0);
        }
    }

    @Test
    public void backstagepss_quality_should_not_less_than_0() {
        Goods goods = new BackstagePassGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) >= 0);
        }
    }

    @Test
    public void sulfuras_quality_should_not_less_than_0() {
        Goods goods = new SulfurasGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) >= 0);
        }
    }

    @Test
    public void normal_quality_should_not_less_than_0() {
        Goods goods = new NormalGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) >= 0);
        }
    }

    @Test
    public void agedbrie_quality_should_not_more_than_50() {
        Goods goods = new AgedBrieGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) <= 50);
        }
    }

    @Test
    public void backstagepss_quality_should_not_more_than_50() {
        Goods goods = new BackstagePassGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) <= 50);
        }
    }

    @Test
    public void sulfuras_quality_should_not_more_than_50() {
        Goods goods = new SulfurasGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) <= 50);
        }
    }

    @Test
    public void normal_quality_should_not_more_than_50() {
        Goods goods = new NormalGoods();
        for (int days = 0; days < goods.getSellIn() + OVER_SELLIN_DAYS; days++) {
            Asserts.assertTrue(String.format("%s after %d ", goods.getName(), days), goods.calQuality(days) <= 50);
        }
    }
}
