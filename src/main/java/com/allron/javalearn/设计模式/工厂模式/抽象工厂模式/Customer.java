package com.allron.javalearn.设计模式.工厂模式.抽象工厂模式;

/**
 * ***
 *
 * @author Allron
 * @date 2020/9/21
 */
public class Customer {
    public static void main(String[] args) {
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
    }
}
