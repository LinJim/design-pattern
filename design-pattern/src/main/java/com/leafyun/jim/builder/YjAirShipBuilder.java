package com.leafyun.jim.builder;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: yj 牌宇宙飞船建造者实现类
 * @date: 2019-01-03
 * @time: 10:27
 */
public class YjAirShipBuilder implements AirShipBuilder {
    /**
     * 实际开发当中这里建造对象可以和工厂模式或者单例模式合作，也可以自己建造对象
     *
     * @return
     */
    @Override
    public Engine builderEngine() {
        return new Engine("1");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        return new OrbitalModule("2");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return new EscapeTower("3");
    }
}
