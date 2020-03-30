package java15_0313;

import java.lang.reflect.Field;

//  反射
public class StringTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str="hello";
        for(int x=0;x<1000;x++){
            str += (x+" ");
        }
        System.out.println(str);
//        String str1="haha";
          //String.intern就能够重复利用池中的对象
//        String str2=new String("haha").intern();
//        System.out.println(str1==str2);
//        String str="hehe";
//        //Field对象对应到某个对象中的一个具体字段
//        Field field=String.class.getDeclaredField("value");
//        //由于String中的value这个字符数组是private的，直接不能访问
//        //先把这个字段改成可访问的
//        field.setAccessible(true);
//        //获取到str中的value数组的内容
//        char[] value=(char[])field.get(str);
//        //        for(int i=0;i<value.length;i++){
////            System.out.println(value[i]);
////        }
//        value[0]='a';
//        System.out.println(str);
    }
}
