package com.study.abstractFactory;

/**
 * 具体的一个工厂 现代人的工厂
 */
public class ModrenFactory  extends AbstractFactory{
    Food createFood() {
        return new Breaked();
    }

    Vehicle createVehicle() {
        return new Car();
    }

    Weapon createWeapon() {
        return new AK47();
    }
}
