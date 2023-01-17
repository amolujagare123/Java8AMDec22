package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {


        Stack<String> s = new Stack<>();

        s.push("Yadav Singh");
        s.push("vishal");
        s.push("sunil");
        s.push("shrungari");
        s.push("rutuja");
        s.push("ramya");

        System.out.println(s);

       // System.out.println(s.search("abcd")); // returns -1

        System.out.println(s.search("rutuja")); // +ve value


    }
}
