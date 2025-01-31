// duplicate parentheses
// find duplicate paretheses are exist or not 
import java.util.Stack;

public class Classroom3 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if (ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; // duplicate
                } else{
                    s.pop(); // opening pair
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // valid string
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(isDuplicate(str));
    }
}
