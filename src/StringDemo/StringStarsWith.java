package StringDemo;

public class StringStarsWith {

    public static void main(String[] args) {

        String str = "My name is sudhir, and My subject is maths";

        System.out.println(str.startsWith("M")); // true
        System.out.println(str.startsWith("My")); // true
        System.out.println(str.startsWith("MY")); // false
        System.out.println(str.startsWith("sudhir")); // false
        System.out.println(str.startsWith("My name")); // true

    }
}
