package java15_0512;

//判断一个数组是否为另一个数组的出栈顺序
//通过新建一个栈A,将数组元素压入栈中,当栈顶元素等于B时,将其出栈
//循环结束时,判断站是否为空,若为空,返回true

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<Integer>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.empty()&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}
