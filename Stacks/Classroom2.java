// Parentheses [] { } ( )

import java.util.Stack;

public class Classroom2 {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if(ch == '(' || ch == '{' || ch == '[') { //opening
                s.push(ch);

                //closing
                if(s.isEmpty()) {
                    return false;
                }
                if((s.peek() == '(' && ch == ')') // ()
                || (s.peek() == '{' && ch == '}') //{}
                || (s.peek() == '[' && ch ==']') ){ //[]
                s.pop();
                }
                else{
                    return true;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        }
        else {
           return false;
        }
    }
    public static void main(String[] args) {
        String str = "]"; // true
        System.out.println(isValid(str));
    }
}
