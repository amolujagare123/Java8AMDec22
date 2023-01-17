package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class QueDemo2 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(26);
        pq.offer(76);
        pq.offer(21);
        pq.offer(56);
        pq.offer(28);
        pq.offer(66);

        // 21,26,28,56,66,76

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }

}
