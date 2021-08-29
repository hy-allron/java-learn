package com.allron.javalearn;



/**
 * ***
 *
 * @author Allron
 * @date 2021/2/19
 */
public class Child extends Parent{


    public static void parentMethod() throws NullPointerException{
        new NullPointerException();
        System.out.println("child method");
    }
}
