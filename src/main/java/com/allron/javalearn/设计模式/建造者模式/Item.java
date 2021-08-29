package com.allron.javalearn.设计模式.建造者模式;

/**
 * 食物条目
 *
 * @author Allron
 * @date 2020/11/23
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
