package com.leafyun.jim.builder;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: yj 牌宇宙飞船建造者装配实现类
 * @date: 2019-01-03
 * @time: 10:29
 */
public class YjAirShipDirector implements AirShipDirector {
    private YjAirShipBuilder yjAirShipBuilder;

    public YjAirShipDirector(YjAirShipBuilder yjAirShipBuilder) {
        this.yjAirShipBuilder = yjAirShipBuilder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = yjAirShipBuilder.builderEngine();
        EscapeTower escapeTower = yjAirShipBuilder.builderEscapeTower();
        OrbitalModule orbitalModule = yjAirShipBuilder.builderOrbitalModule();

        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }
}
