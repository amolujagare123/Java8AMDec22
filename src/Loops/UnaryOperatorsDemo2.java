package Loops;

public class UnaryOperatorsDemo2 {

    public static void main(String[] args) {
        int i = 10;

        System.out.println(i);  // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8

        // 10 _ _ _
        /*
        * i++ / i-- : first statement is executed
        * then increment / decrement happens (post operators)

        ++i / -- i : first increment / decrement happens
        * then statement is executed  (pre operators)
*/

    }
}
