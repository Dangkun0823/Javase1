package java15_0511;

import java.util.Stack;

public class MyStack {
    private int[] array=new int[100];
    private int size=0;

    //入栈
    public void push(int x){
        array[size]=x;
        size++;
    }

    //出栈
    public int pop(){
        int ret=array[size-1];
        size--;
        return ret;
    }

    //取栈顶
    public int peek(){
        return array[size-1];
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
