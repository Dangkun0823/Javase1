package java15_0306.animal;

public class Bat extends Animal implements IFlying{
    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+" 使用翅膀正在飞 ");
    }
}
