package java15_0313;

public class Test {
    public static void main(String[] args) {
        //字符串和字符数组的相互转换
        //字符串=>字符数组
        String str="hehe";
        //toCharArray是把String中包含的字符数组拷贝一份
        char[] data=str.toCharArray();
        //此时修改data的内容是否影响str的内容？
//        for(int i=0;i<data.length;i++){
//            System.out.println(data[i]);
//        }
        data[0]='a';
        System.out.println(str);

        //字符数组=>字符串
//        char[] array={'a','b','c'};
//        String str1=new String(array);
//        System.out.println(str1);
    }
}
