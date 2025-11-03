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
      
      System.err.println("now the Queue starts from  here");
      // Internal implemetation of Queue usining inbuilt functions
      Queue<Integer> queue = new LinkedList<>(); 

      queue.add(21);
      queue.add(22);
      queue.add(23);
      queue.add(24);
      queue.add(25);
      queue.add(26);
      queue.add(27);

    
  }
}
