package cn.xpbootcamp.gilded_rose.domain.entity;

public interface Goods {

    String getName();

    Integer getSellIn();

    Integer getOriginalQuality();

    Integer calQuality(Integer days);
}
