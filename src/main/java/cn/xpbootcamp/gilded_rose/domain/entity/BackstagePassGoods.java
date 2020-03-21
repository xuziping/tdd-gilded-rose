package cn.xpbootcamp.gilded_rose.domain.entity;

public class BackstagePassGoods implements Goods {

    @Override
    public Integer calQuality(Integer days) {
        if (days > getOriginalQuality()) {
            return 0;
        }
        int quality = getOriginalQuality();
        for (int currentDay = 0; currentDay <= days && currentDay < getSellIn() - 10; currentDay++) {
            quality += 1;
        }
        for (int currentDay = getSellIn() - 10; currentDay <= days && currentDay < getSellIn() - 5; currentDay++) {
            quality += 2;
        }
        for (int currentDay = getSellIn() - 5; currentDay <= days && currentDay < getSellIn(); currentDay++) {
            quality += 3;
        }
        return quality;
    }

    @Override
    public String getName() {
        return "BackstagePass";
    }

    @Override
    public Integer getSellIn() {
        return 15;
    }

    @Override
    public Integer getOriginalQuality() {
        return 10;
    }
}
