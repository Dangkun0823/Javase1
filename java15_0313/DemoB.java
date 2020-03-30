package java15_0313;

public class DemoB {
    public static void main(String[] args) {
        //字符串获取到每个字符
        String str="hello";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            System.out.println(c);
        }
        //字符串转字节数组
//        String str="中国牛逼";
//        byte[] array=str.getBytes();
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]+" ");
//        }
//        System.out.println();
//        String str2=new String(array);
//        System.out.println(str2);

        //字符串比较大小
//        String str1="hehe";
//        String str2="haha";
//        //compareTo是Compareble接口中提供的抽象方法
//        //返回值>0,str1>str2,<0str1<str2,==0,str1和str2内容相等
//        System.out.println(str1.compareTo(str2));

        //忽略大小写的比较
//        String str1="hehe";
//        String str2="HEHE";
//        System.out.println(str1.equalsIgnoreCase(str2));

        //判定字符串字串
//        String str1="hello worldwor";
//        String str2="wor";
////        System.out.println(str1.contains(str2));
//        //不光能判定是否包含字串，还能确定字串所在位置
//        //返回-1表示str1不包含str2
//        //返回结果是str2在str1中第一次出现时的下标
//        System.out.println(str1.indexOf(str2));
//        System.out.println(str1.lastIndexOf(str2));

//        //字符串以特定的字串开头/结尾(也可以借助indexOf实现）
//        String str="hello world";
//        System.out.println(str.startsWith("he"));
//        System.out.println(str.endsWith("rld"));

        //字符串替换
        //生成替换后的新字符串，并没有修改原来的字符串
//        String str="hello worlod";
//        System.out.println(str.replaceAll("lo","a"));
//        System.out.println(str.replaceFirst("l","e"));
//        System.out.println(str);
    }
}
