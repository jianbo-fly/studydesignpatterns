package com.study.abstractFactory;
/**
 * 具体的一个工厂  魔法工厂
 */
public class MogicFactory extends AbstractFactory {
   //魔方师的食物
    Food createFood() {
        return new MushRoom();
    }
   //魔法师的交通工具
    Vehicle createVehicle() {
        return new Broom();
    }
   //魔方师的武器
    Weapon createWeapon() {
        return new MagicStick();
    }
}
