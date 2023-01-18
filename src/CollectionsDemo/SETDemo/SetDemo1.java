package CollectionsDemo.SETDemo;

import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("Abhijeet");
        hs.add("Amit");
        hs.add("Bharat");
        hs.add("Darshan");
        hs.add("Neha");
        hs.add("Kirti");
        System.out.println(hs.add("Prabhakara"));
        System.out.println(hs.add("Prabhakara"));

        System.out.println(hs);
    }
}
