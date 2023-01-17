package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {


        Stack<String> s = new Stack<>();

        System.out.println(s.empty()); // true

        s.push("Yadav Singh");
        s.push("vishal");
        s.push("sunil");
        s.push("shrungari");
        s.push("rutuja");
        s.push("ramya");

        System.out.println(s.empty()); // false
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s);



    }
}
