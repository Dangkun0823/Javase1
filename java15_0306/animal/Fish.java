package java15_0306.animal;

public class Fish extends Animal implements ISwimming{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + " 使用尾巴游泳");
    }
}
