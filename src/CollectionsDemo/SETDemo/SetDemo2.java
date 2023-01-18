package CollectionsDemo.SETDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("Abhijeet");
        lhs.add("Amit");
        lhs.add("Bharat");
        lhs.add("Darshan");
        lhs.add("Neha");
        lhs.add("Kirti");
        System.out.println(lhs.add("Prabhakara"));
        System.out.println(lhs.add("Prabhakara"));

        System.out.println(lhs);
    }
}
