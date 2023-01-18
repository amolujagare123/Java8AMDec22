package CollectionsDemo.SETDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();


        ts.add("Bharat");
        ts.add("Abhijeet");
        ts.add("Amit");
        ts.add("Kirti");
        ts.add("Darshan");
        ts.add("Neha");

        System.out.println(ts.add("Prabhakara"));
        System.out.println(ts.add("Prabhakara"));

        System.out.println(ts);
    }
}
