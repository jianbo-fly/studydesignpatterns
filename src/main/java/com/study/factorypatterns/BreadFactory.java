package com.study.factorypatterns;

public class BreadFactory {
    public Food creatrFood(){

        return new Bread();
    }
}
