package questions;

import java.util.Stack;

public class Question2 {
    public String removeDuplicates(String s) {
        StringBuilder builder = new StringBuilder();

        for (char c: s.toCharArray()) {
            if (builder.length() > 0 && c == builder.charAt(builder.length() - 1)) {
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        String s = "abbaca";
        System.out.println(q2.removeDuplicates(s));
    }
}
