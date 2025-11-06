package StackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(13);
        queue.insert(23);
        queue.insert(33);
        queue.insert(43);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.front());
    }
}
