package java15_0306;

public class Test {
    public static void main(String[] args) {
        //接口使用过程中同样也依赖“多态”这样的语法
        IShape shape=new Circle();
        shape.draw();
    }
}
