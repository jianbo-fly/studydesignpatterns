package com.study.factorypatterns;

/**
 * 增加了可扩展性，可以任意定制生产过程
 */
public class CarFactory {

    public Moveable create(){
        /**
         * 这里可以添加一些日志或者是权限的处理
         */
        return new Car();
    }
}
