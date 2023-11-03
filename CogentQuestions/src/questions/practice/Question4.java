package questions.practice;

import java.util.Stack;

/*
Balanced parenthesis/Valid parenthesis:
Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid.
The function should return true if the string is valid, and false if it's invalid.
 */
public class Question4 {
    public boolean isValid(String s) {
        //create an empty stack:
        Stack<Character> stack= new Stack<Character>();
        for(char c: s.toCharArray()){
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
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Question4 question4= new Question4();
        String s= "([]{})";
        System.out.println(question4.isValid(s));
    }
}
