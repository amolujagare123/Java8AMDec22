package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class QueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("Amol");
        pq.offer("Pooja");
        pq.offer("Abhijit");
        pq.offer("Kirti");
        pq.offer("Ankita");


        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }

}
