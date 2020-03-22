package cn.xpbootcamp.gilded_rose.domain.entity;

public class BackstagePassGoods implements Goods {

    private static final Integer START_DAY = 1;

    @Override
    public Integer calQuality(Integer days) {
        if (days > getSellIn()) {
            return 0;
        }
        int quality = getOriginalQuality();
        for (int currentDay = START_DAY; currentDay <= days && currentDay <= getSellIn() - 10; currentDay++) {
            quality += 1;
        }
        for (int currentDay = getSellIn() - 9; currentDay <= days && currentDay <= getSellIn() - 5; currentDay++) {
            quality += 2;
        }
        for (int currentDay = getSellIn() - 4; currentDay <= days && currentDay <= getSellIn(); currentDay++) {
            quality += 3;
        }
        return quality > 50 ? 50 : quality;
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
