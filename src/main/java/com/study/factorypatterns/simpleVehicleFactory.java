package com.study.factorypatterns;

/**
 * 简单工厂的可扩展性不好
 */
public class simpleVehicleFactory {
    public Car createCar(){
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
