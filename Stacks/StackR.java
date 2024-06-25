// Reverse a String using a stack
import java.util.*;
public class StackR {
    public static void pushAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
        stack.push(data);
        return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder(" ");
        while(!stack.isEmpty()){
            char curr = stack.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        //String str = "abc";
        String str = "Hello World";
        String result = reverseString(str);
            System.out.println(result);
    }
}
