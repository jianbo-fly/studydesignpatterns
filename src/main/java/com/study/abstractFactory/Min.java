package com.study.abstractFactory;

public class Min {
    public static void main(String[] args) {
        /**
         * 区别请看factorypartterns中的main函数
         */
        //现代人的工厂,可根据需要的不同的工厂进行调用
  //  AbstractFactory factory=new ModrenFactory();
    AbstractFactory factory=new MogicFactory();
     Vehicle v=factory.createVehicle();
     v.go();
     Food f=factory.createFood();
     f.printName();
     Weapon w=factory.createWeapon();
     w.shoot();

        /**
         * 如果要调用魔法世界的人的行为只需将：
         *     AbstractFactory factory=new MagicFactory();
         *
         *     这里新增一个工厂的方式不会去改变现有的代码，而是重新去实现AbstractFactory,以及那三个抽象方法
         *
         *     简单理解 在抽象工厂中调用抽象方法，而实际方法对抽象方法进行了不同的实现，在创建一个实际的工厂，那么通过调用这个抽象工厂可以
         *     实现调用具体的实现方法。
         */
    }
}
