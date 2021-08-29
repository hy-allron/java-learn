package com.allron.javalearn.java8;

/**
 * @author Allron
 * @date 2019/10/08
 **/
public class LambdaTest {

    interface Predicate<T> {
        boolean test(T t);
    }

    public static boolean doPredicate(int age, Predicate<Integer> predicate) {
        return predicate.test(age);
    }

    public static void main(String[] args) {
        boolean isAdult = doPredicate(20, x -> x >= 18);
        System.out.println(isAdult);
    }
}
