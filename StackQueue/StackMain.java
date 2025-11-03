package StackQueue;

public class StackMain {
    public static void main(String[] args) throws StackException{
      CustomStack stack = new DynamicStack(5);

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
      System.out.println(stack.peek());
    }
}
