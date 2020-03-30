package java15_0103;

public class Student {
    private String id="10000";
    private String name="张三";
    public String toString(){
        System.out.println("执行toString");
        return id+","+name;
    }
    //alt+insert可以自动生成
//    public void print(){
//        System.out.println(this.id+","+this.name);
//    }
//    {
         //构造块
//        System.out.println("这是构造块");
//    }
//
//    static {
       //静态代码块
//        System.out.println("这是静态代码块");
//    }
//    public Student(){
//        System.out.println("这是构造方法");
//    }
    //如果把一个属性在多个地方都初始化的话，那么构造方法是他最终的值
    //因为构造方法最后执行
}
