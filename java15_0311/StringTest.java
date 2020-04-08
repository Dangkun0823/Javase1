package java15_0311;

public class StringTest {
    public static void main(String[] args) {
        String str=null;
        //System.out.println(str.equals("hehe"));
        //更推荐下面的写法，能避免str为null的时候出现空指针异常
        System.out.println("hehe".equals(str));
        String str1="hehe";
        String str2=new String("haha");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
