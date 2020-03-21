package cn.xpbootcamp.gilded_rose.domain.entity;

public class SulfurasGoods implements Goods {

    @Override
    public Integer calQuality(Integer days) {
        return 0;
    }

    @Override
    public String getName() {
        return "Sulfuras";
    }

    @Override
    public Integer getSellIn() {
        return 0;
    }

    @Override
    public Integer getOriginalQuality() {
        return 0;
    }
}
