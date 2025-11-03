import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltStackingQueue {
   public static void main(String[] args) {
      // Internal implemetation of stack usining inbuilt functions
      Stack<Integer> stack = new Stack<>();

      stack.push(95);
      stack.push(85);
      stack.push(75);
      stack.push(65);
      stack.push(55);
      stack.push(45);
      stack.push(35);


      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      
      
  }
}
