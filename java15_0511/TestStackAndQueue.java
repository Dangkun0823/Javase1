package java15_0511;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//括号匹配问题
public class TestStackAndQueue {
    public static boolean isValid(String s){
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.pop();
            if(map.get(top)==c){
                continue;
            }
            else {
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({})"));
    }
}
