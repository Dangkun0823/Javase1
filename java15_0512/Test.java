package java15_0512;

import java.util.Stack;


//力扣棒球比赛

public class Test {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(String s:ops){
            if(s.equals("+")){
               int a=stack.peek();
               stack.pop();
               int b=stack.peek();
               int c=a+b;
               stack.push(a);
               stack.push(c);
            }else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }else if(s.equals("C")){
                stack.pop();
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        int sum=0;
            while (!stack.empty()){
                sum=sum+stack.pop();
            }
            return sum;
        }
    }
