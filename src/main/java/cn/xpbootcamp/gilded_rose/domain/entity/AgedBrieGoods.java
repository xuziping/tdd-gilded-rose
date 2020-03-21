package cn.xpbootcamp.gilded_rose.domain.entity;

public class AgedBrieGoods implements Goods {

    @Override
    public Integer calQuality(Integer days) {
        return getOriginalQuality() + days * 1;
    }

    @Override
    public String getName() {
        return "AgedBrie";
    }

    @Override
    public Integer getSellIn() {
        return 10;
    }

    @Override
    public Integer getOriginalQuality() {
        return 10;
    }
}
