package cn.xpbootcamp.gilded_rose.domain.entity;

public class AgedBrieGoods implements Goods {

    @Override
    public Integer calQuality(Integer days) {
        return null;
    }

    @Override
    public String getName() {
        return "AgedBrie";
    }

    @Override
    public Integer getSellIn() {
        return null;
    }

    @Override
    public Integer getOriginalQuality() {
        return null;
    }
}
