import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleQueue {
  public static void main(String[] args) {
    
    // Internal implemetation of Deque(DECK) using inbuilt functions
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(10);
    deque.addFirst(5);
    deque.addLast(15);
    deque.add(20);
  }  
}
