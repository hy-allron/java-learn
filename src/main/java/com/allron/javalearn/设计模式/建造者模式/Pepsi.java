package com.allron.javalearn.设计模式.建造者模式;

/**
 * 百事可乐
 *
 * @author Allron
 * @date 2020/11/23
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
