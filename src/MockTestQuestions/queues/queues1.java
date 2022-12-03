package MockTestQuestions.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class queues1 {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Shad");
        pq.add("Azam");
        pq.add("aman");
        System.out.println(pq);
        System.out.println("Poll Method " + pq.poll());
        pq.remove();
        System.out.println(pq);
    }
}
