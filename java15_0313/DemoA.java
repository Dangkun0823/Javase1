package java15_0313;

//判断字符串是否全为数字
public class DemoA {
    public static boolean isNumber(String str) {
        //获取到每一个字符
        //方式1，直接使用charAt
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //ASCII描述了'0'-'9'
            if (c > '9' || c < '0') {
                //找到了一个不是数字的字符
                return false;
            }
        }
        return true;
//        //方式2，通过String转字符数组的方式来获取到每个内容
//        char[] data=str.toCharArray();
//        for(int i=0;i<str.length();i++){
//            if(data[i]>'9'||data[i]<'0'){
//                return false;
//            }
//        }
//        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("1236"));
    }
}
