package java15_0320;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        //1.创建Collection
        Collection<String> collection=new ArrayList<>();
        //泛型里的参数必须是引用类型，不能是内战类型，可以用包装类解决
        //2.使用size方法
        System.out.println(collection.size());
        //3.使用isEmpty方法
        System.out.println(collection.isEmpty());
        //4.使用add方法插入
        collection.add("我");
        collection.add("爱");
        collection.add("Java");
        System.out.println(collection);
        //5.再次使用size和isEmpty
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        //6.可以toArray把Collection转化成数组
        //得到的结果是Object[]
        Object[] array=collection.toArray();
        System.out.println(Arrays.toString(array));
        //7.直接使用for循环遍历集合中的元素
        //先用for each循环来写比较简单，普通的for循环，要用迭代器
        for(String s:collection){
            //s就会指向collection中的每一个元素
            System.out.println(s);
        }
        //8.使用contains方法判断元素是否存在
        System.out.println(collection.contains("我"));
        //9.使用remove来删除元素
        collection.remove("我");
        System.out.println("删除之后的：");
       for(String s:collection){
            System.out.println(s);
        }
        //10.使用clear方法清空所有元素
        collection.clear();
        System.out.println(collection.size());
    }
}
