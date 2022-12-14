package StringDemo;

public class StringEndsWith {

    public static void main(String[] args) {

        String str = "My name is sudhir";

        System.out.println(str.endsWith("r")); // true
        System.out.println(str.endsWith("M")); // false
        System.out.println(str.endsWith("ir")); // true
        System.out.println(str.endsWith("ir")); // true
        System.out.println(str.endsWith("hir")); // true
        System.out.println(str.endsWith("Hir")); // false
    }
}
