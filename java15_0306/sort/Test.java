package java15_0306.sort;

import java.lang.reflect.Array;
import java.util.Arrays;




public class Test {
    public static void main(String[] args) {
        Boy[] boys = {
                new Boy("吴彦祖", 100, 100),
                new Boy("肖战", 50, 80),
                new Boy("胡歌", 100, 120),
                new Boy("巨魔战将", 20, 20)
        };
        Arrays.sort(boys);
        System.out.println(Arrays.toString(boys));

        sort(boys);
        System.out.println(Arrays.toString(boys));
        //sort里面的compareTo就不需要你关注，需要调用者去实现，即创建boys的那个类
    }
    // 模拟实现以下 Arrays.sort
    // Comparable 本来带一个泛型参数. 这个参数也可以没有, 没有就表示 Object
    public static void sort(Comparable[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = array.length - 1; cur > bound; cur--) {
                if (array[cur - 1].compareTo(array[cur]) > 0) {
                    // 如果前一个元素和后一个元素相比, 不符合排序要求, 就交换两个元素
                    Comparable tmp = array[cur - 1];
                    array[cur - 1] = array[cur];
                    array[cur] = tmp;
                }
            }
        }
    }
}
