package cn.xpbootcamp.gilded_rose.domain.entity;

public class NormalGoods implements Goods {

    @Override
    public String getName() {
        return "Normal";
    }

    @Override
    public Integer getSellIn() {
        return 20;
    }

    @Override
    public Integer getOriginalQuality() {
        return 20;
    }

    @Override
    public Integer calQuality(Integer days) {
        Integer quality = getOriginalQuality();
        for (int currentDay = 0; currentDay <= days && currentDay < getSellIn(); currentDay++) {
            quality += -1;
        }
        for (int currentDay = getSellIn(); currentDay <= days; currentDay++) {
            quality += -2;
        }
        return quality < 0 ? 0 : quality;
    }
}
