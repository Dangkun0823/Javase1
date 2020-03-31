package java15_0322;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //1.创建List实例
        List<String> list = new ArrayList<>();
        //2.新增元素
        list.add("C++");
        list.add("Java");
        list.add("Python");
        //3.打印整个list
        System.out.println(list);
        //4.按照下标来访问元素
        System.out.println(list.get(2));
        //5.跟据下标来修改元素
        list.set(0, "PHP");
        System.out.println(list);
        //6.循环遍历list
        for (String x : list) {
            System.out.println(x);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //7.使用subList获取子序列
        System.out.println("获取子序列");
        System.out.println(list.subList(1,2));
        //8.可以使用构造方法构造出新的List对象
        List<String> list1=new ArrayList<>(list);
        System.out.println("复制了一份list1：");
        System.out.println(list1);
        list.set(0,"C#");
        System.out.println(list1);
        //验证是不是深拷贝，需要给List泛型参数填一个可变对象的类型才可以
    }
}
