package StringDemo;

public class SubstringDemo {

    public static void main(String[] args) {

        String str = "My name is amol";

        System.out.println(str.substring(4));

        /*substring(beginIndex,endIndex): it returns a string starting
        with beginIndex character till the endIndex character of the
        string  (where beginIndex character is inclusive & endIndex
        character is not inclusive)
*/
        System.out.println(str.substring(5,9));

    }
}
