package cn.xpbootcamp.gilded_rose.domain.entity;

public class BackstagePassGoods implements Goods {

    @Override
    public Integer calQuality(Integer days) {
        return null;
    }

    @Override
    public String getName() {
        return "BackstagePass";
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
