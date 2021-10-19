package com.allron.javalearn.算法.每日一题;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * 描述：从数组a[]={1,2,3,4,5,6,7,8,9,10}中随机抽取5个数且不重复 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/19 16:38 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211019随机抽样 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Random r = new Random();
        int count = 10;
        while (count-- > 0) {
            Set<Integer> result = new HashSet<Integer>(5);
            while (result.size() < 5) {
                int index = r.nextInt(10) % 10;
                int currentData = a[index];
                if (result.contains(currentData)) {
                    continue;
                }
                System.out.print("随机加入：" + currentData);
                result.add(currentData);
            }
            System.out.println("第" + count + "次，last随机数：" + result);
        }
    }
}



