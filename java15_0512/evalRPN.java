package java15_0512;

import java.util.Stack;

//逆波兰表达式求值(1+2 的逆波兰表达式为1 2 +)
//通过定义一个栈辅助计算
public class evalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(s.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("/")){
                int num=stack.pop();
                stack.push(stack.pop()/num);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
