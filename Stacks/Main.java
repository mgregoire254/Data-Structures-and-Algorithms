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
        stack.push("FFXIV");
        stack.push("Mario Kart");
        //print contents of stack
        System.out.println(stack);
        //remove last item from stack and assign it to variable
        String myFavGame = stack.pop();
        //print remaining items from stack
        System.out.println(stack);
        //print variable containing popped item from stack
        System.out.println(myFavGame);
        //assign last item from stack to variable without removing it
        String myNewFavGame = stack.peek();
        //print variable containing peeked item from stack
        System.out.println(myNewFavGame);
        //print items from stack
        System.out.println(stack);








    
    }

}
