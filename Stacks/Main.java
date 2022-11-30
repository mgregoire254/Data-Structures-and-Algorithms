package Stacks;
import java.util.Stack;

public class Main{
    
    public static void main(String[] args) {
        // Create new stack called stack
        Stack<String> stack = new Stack<String>();

        // Push items to stack
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DooM");
        stack.push("Borderlands");
        stack.push("FFVII");
        //print contents of stack
        System.out.println(stack);
        //remove last item from stack and assign it to variable
        String myFavGame = stack.pop();
        //print remaining items from stack
        System.out.println(stack);
        //print variable containing popped item from stack
        System.out.println(myFavGame);








    
    }

}
