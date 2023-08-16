package collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Sunday");
        priorityQueue.offer("Monday");
        priorityQueue.offer("Tuesday");
        priorityQueue.offer("Wednesday");
        priorityQueue.offer("Thursday");
        priorityQueue.offer("Friday");
        priorityQueue.offer("Saturday");

        System.out.println("queue"+priorityQueue);
        System.out.println(" element "+priorityQueue.element());
        System.out.println(" peek "+priorityQueue.peek());
        System.out.println("poll "+priorityQueue.poll());
        System.out.println("queue"+priorityQueue);

    }
}
