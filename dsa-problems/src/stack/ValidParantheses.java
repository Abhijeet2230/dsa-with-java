package stack;

import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {

        System.out.println(isValid("({})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch=='('|| ch=='['|| ch=='{'){
                stack.push(ch);
            }

            else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if(ch==')' && top!='(') return false;
                if(ch==']' && top!='[') return false;
                if(ch=='}' && top!='{') return false;
            }
        }
        return stack.isEmpty();
    }
}
