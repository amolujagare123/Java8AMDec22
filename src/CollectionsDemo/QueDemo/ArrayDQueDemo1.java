package CollectionsDemo.QueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDQueDemo1 {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque();

        adq.offer(26);
        adq.offer(76);
        adq.offer(21);
        adq.offer(56);
        adq.offer(28);
        adq.offer(66);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

      /*  adq.removeFirst();
        adq.removeLast();*/

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }

}
