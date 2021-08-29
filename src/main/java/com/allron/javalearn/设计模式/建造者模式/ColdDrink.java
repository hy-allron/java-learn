package com.allron.javalearn.设计模式.建造者模式;

/**
 * 可乐
 *
 * @author Allron
 * @date 2020/11/23
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
