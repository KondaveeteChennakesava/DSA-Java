import java.util.Stack;

public class Main{
    public static void main(String args[]){
        // Info: Applications
        // 1: Undo/ Redo in text editors
        // 2: Forward/Backward in browers
        // 3: Backtracking algorithms(maze, file directories)
        // 4: Calling Functions (call stack)

        // Inbuilt methods
        // empty, push, pop, peek
        // System.out.println(stack.empty());
        
        Stack<String> stack = new Stack<>();

        stack.push("Movie1");
        stack.push("Movie2");
        stack.push("Movie3");
        stack.push("Movie4");
        stack.push("Movie5");

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}