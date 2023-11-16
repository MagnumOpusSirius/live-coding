package questions.practice;

import java.util.Stack;

/*
- valid parenthesis:
- ()[]{} -> return response of Boolean type
- ([) -> invalid return false:
 */
public class Basic {
//LIFO ->
    public boolean isValid(String s){
        //create an empty stack:
        Stack<Character> stack = new Stack<>();
        String str= new String();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='[' || c==')' || c==']' || c=='}'){
                str=str+c;
            }
        }
        System.out.println(str);
        //iterate through this string of characters:
        for(char c: str.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }

        }
//        System.out.println(stack);
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Basic b= new Basic();
        String s= "([]{}ab)";
        System.out.println(b.isValid(s));
    }
}
