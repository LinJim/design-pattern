package com.leafyun.jim.builder;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description: 宇宙飞船构造者
 * @date: 2019-01-03
 * @time: 10:22
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
