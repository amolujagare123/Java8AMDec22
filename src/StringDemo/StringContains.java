package StringDemo;

public class StringContains {

    public static void main(String[] args) {

        String str = "My name is sudhir, and My subject is maths";

        System.out.println(str.contains("sudhir")); // true
        System.out.println(str.contains("subject")); // true
        System.out.println(str.contains("maths")); // true
        System.out.println(str.contains("my")); // false

    }
}
