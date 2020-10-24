package com.study.factorypatterns;

public class Min {
    public static void main(String[] args) {
       /* Car car=new Car();
        car.go();*/
        /**
         * 这种方式（工厂方法）便于增加不同 属性  （乘车方式，吃饭 。。。。）=》是对具体的产品就行扩展
         * 区别于抽象工厂方式  （抽象工厂中乘车，吃放等方式以及规定了，只能新增不同的类别的人群来做这些事（现代人，魔法世界的人）
         * 是对整个产品族进行扩展
         * ）
         */
       Moveable m=new CarFactory().create();
       m.go();

       Food f=new BreadFactory().creatrFood();
       f.eat();
    }
}
