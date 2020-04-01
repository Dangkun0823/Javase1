package java15_0327;

import java.util.Stack;

//两个栈实现一个队列
public class MyQueueBy2Stack {
    private Stack<Integer> A=new Stack<>();
    private Stack<Integer> B=new Stack<>();

    public void push(int x){
        //1.先把B的元素放到A中
        while (!B.isEmpty()){
            int tmp=B.pop();
            A.push(tmp);
        }
        //2.把新元素入A即可
        A.push(x);
    }

    public Integer pop(){
        //1.如果为空，直接返回
        if(empty()){
            return null;
        }
        //2. 把 A 中的元素都倒腾给 B
        while (!A.isEmpty()){
            int tmp=A.pop();
            B.push(tmp);
        }
        // 3. 针对 B 进行出栈
        return B.pop();
    }

    public Integer peek(){
        // 1. 如果为空, 就直接返回
        if (empty()) {
            return null;
        }
        // 2. 把 A 中的元素都倒腾给 B
        while (!A.isEmpty()) {
            int tmp = A.pop();
            B.push(tmp);
        }
        // 3. 直接取 B 的栈顶元素
        return B.peek();
    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
