package cn.xpbootcamp.gilded_rose.domain.entity;

public class AgedBrieGoods extends Goods implements IQualityStrategy {

    @Override
    public Integer calQuality(Integer days) {
        return null;
    }
}
