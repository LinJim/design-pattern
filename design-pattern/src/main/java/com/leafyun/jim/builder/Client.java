package com.leafyun.jim.builder;

/**
 * @author: JimLin
 * @email: leafyunjim@gmail.com
 * @description:
 * @date: 2019-01-03
 * @time: 10:35
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector airShipDirector = new YjAirShipDirector(new YjAirShipBuilder());

        AirShip ship = airShipDirector.directAirShip();
        System.out.println(ship.getEngine().getName());
    }
}
