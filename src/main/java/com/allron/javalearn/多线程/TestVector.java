package com.allron.javalearn.多线程;

import java.util.Vector;

/**
 * 描述：TODO <br>
 * 作者：allron <br>
 * 修改日期：2021/11/10 16:56 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class TestVector implements Runnable{
    static Vector vector = new Vector();
     void addVector(){
        for(int i = 0;i < 10000;i++){
            vector.add(i);
        }
    }

    static Object getVector(){
        int index = vector.size() - 1;
        return vector.get(index);
    }

    static void removeVector(){
        int index = vector.size() - 1;
        vector.remove(index);
    }

    @Override
    public void run() {
        getVector();
    }

    public static void main(String[] args) {
        TestVector testVector = new TestVector();
        testVector.addVector();
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < vector.size();i++){
                getVector();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0;i < vector.size();i++){
                removeVector();
            }
        });

        t1.start();
        t2.start();
    }
}
