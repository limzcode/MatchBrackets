import java.util.*;

public class Match{


    static boolean matchBrackets(String brackets) {
        Stack<Character> new_stack = new Stack<Character>();
        int length = brackets.length();

        for(int i = 0; i<length; i++){

            char x = brackets.charAt(i);
            if( x == '(' || x == '{' || x == '[' ){
                new_stack.push(x);
            } else {
                if (new_stack.isEmpty()) return false;

                char y;

                switch (x){
                    case ')':
                        y = new_stack.pop();
                        if (y == '{' || y=='[')
                            return false;
                        break;
                    case '}':
                        y = new_stack.pop();
                        if (y == '(' || y=='[')
                            return false;
                        break;
                    case ']':
                        y = new_stack.pop();
                        if (y == '(' || y=='{')
                            return false;
                        break;
                }
                
            }
        }
        return (new_stack.isEmpty());
    }
    
    public static void main(String[] args){

        String brackets = "[[{}()]]";

        if (matchBrackets(brackets)) {
            System.out.println("Valid "); 
        } else {
            System.out.println("Invalid"); 
        } 

    }
}

https://www.baeldung.com/java-balanced-brackets-algorithm
