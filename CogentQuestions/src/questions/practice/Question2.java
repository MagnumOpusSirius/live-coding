package questions.practice;

//String "abbaca" => "ca" remove all adjacent duplicates in string
public class Question2 {
    public String removeDuplicate(String str){
        /*
        brute force: check first element == second elem => remove both.

        logic => imagine we have an stack []
        => imagine we loop through the string:
        => we check if the top of the stack == currentCharacter
        => if it is not then we add that currentCharacter to top of stack
         */
        char[] stack = new char[str.length()];

        int top=0;

        for(int i =0; i<str.length(); i++){
            char currentChar= str.charAt(i); //getting the current character that we are looping

            if(top>0 && stack[top-1] == currentChar){ //[a,b,b,a,c,a] => []
                top--;
            }
            else{
                stack[top]= currentChar; //setting the currentChar which is 'a' to the top of stack => [c,a] =>
                top++;
            }
        }
        return new String(stack, 0, top); //O(n)
    }

    public static void main(String[] args) {
        Question2 question2= new Question2();

        String str= "abbaca";

        System.out.println(question2.removeDuplicate(str));
    }
}
