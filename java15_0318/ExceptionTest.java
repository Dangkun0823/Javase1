package java15_0318;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        String result= null;
        try {
            result = readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(result);
//            func1();
//        try{
//            divide(20,0);
//        }catch (Exception e){
//            System.out.println("捕获到异常了");
//            e.printStackTrace();
//        }
    }

    //受查异常
    public static String readFile() throws FileNotFoundException{
        //创建一个file对象
        File file=new File("d:/wps");
            Scanner scanner=new Scanner(file);
            //使用scanner就能完成读文件的操作
        return "";
    }

    public static int divide(int x,int y){
        if(y==0){
            throw new ArithmeticException("除数为0");
        }
        return x/y;
    }

    public static void func1(){
        fun2();
    }

    public static void fun2(){
        try {
            String str=null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
