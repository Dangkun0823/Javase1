package java15_0103;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println(student1);
        //当需要打印成字符串的时候会自动执行toString方法
//        student1.print();
        System.out.println(new Student());
        //匿名对象
    }
}
