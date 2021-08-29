package com.allron.javalearn.设计模式.单例模式;

/**
 * 懒汉式（线程不安全）
 *
 * @author Allron
 * @date 2020/9/13
 */
public class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo(){

    }

    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
