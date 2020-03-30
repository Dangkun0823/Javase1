package java15_0102;

import java.security.PublicKey;

public class Student {
    //成员变量/字段/属性
     private String id;
     private String name;
     private double score;
    public Student(){
        id="10000";
        name="张三";
        score=5.0;
        System.out.println("执行构造方法");
    }

    public Student(String name) {
        this("",name,0.0);
    }
    //this()调用构造方法

    public Student(String id, String name, double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //这里故意没加static
    private void print(){
        System.out.println("id:"+getId()
                +",name:"+name
                +",score:"+score);
    }
    //被private修饰后只能在类的内部使用
}
