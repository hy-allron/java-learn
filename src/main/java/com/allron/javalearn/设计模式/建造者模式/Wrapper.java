package com.allron.javalearn.设计模式.建造者模式;

/**
 * 纸盒
 *
 * @author Allron
 * @date 2020/11/23
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
