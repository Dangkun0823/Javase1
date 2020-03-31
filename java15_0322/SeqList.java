package java15_0322;

//泛型类
public class SeqList<E> {
    //当前这个data的类型是啥，可以就当成是一个Object[].Object具体代表的是哪种类型
    //需要最终在实例化SeqList的时候才能确定下来.
    //E这样的泛型参数是不能被直接实例化的，当前还不知道E到底是啥类型
    //E这样的泛型参数只能是引用类型
    private E[] data=(E[])new Object[100];
    private int size;

    public void add(E elem){
        data[size]=elem;
        size++;
    }

    public E get(int index){
        return data[index];
    }

    public static void main(String[] args) {
        SeqList<String> seqList=new SeqList<>();
        //String也是继承自Object
        //调用add的时候相当于是向上转型
        seqList.add("aaa");
        seqList.add("bbb");
        //调用get的时候返回的是Object，这里需要向下转型
//        String str=(String)seqList.get(0);
         String str=seqList.get(0);

         SeqList<Animal> animals=new SeqList<>();
         animals.add(new Animal());
         animals.add(new Animal());
         Animal animal=animals.get(0); //返回值也不需要强转

        SeqList<Integer> integerSeqList=new SeqList<>();
        //Integer是引用类型，可以作为泛型数据
        //这个操作相当于int=>Integer 装箱（boxing）
//        Integer num=new Integer(10);
//        Integer num=Integer.valueOf(10); //valueOf是一种静态方法
        Integer num=10; //可以直接把int赋值给Integer，自动装箱(编译器赋予包装类的特殊功能)
        integerSeqList.add(num);

//       把Integer=>int 拆箱(unboxing)
        num=integerSeqList.get(0);
//        int value=num.intValue(); //手动拆箱
        int value=num; //自动拆箱
        //自动装箱和自动拆箱就是隐式类型转换
    }
}