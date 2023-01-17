package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class QueDemo3 {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        pq.offer(26);
        pq.offer(76);
        pq.offer(21);
        pq.offer(56);
        pq.offer(28);
        pq.offer(66);
        pq.offer('a');
        pq.offer(true);
        pq.offer("true123");

        // 21,26,28,56,66,76

        System.out.println(pq);

    }

}
