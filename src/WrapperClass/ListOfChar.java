package WrapperClass;

import java.util.ArrayList;

public class ListOfChar {

    public static void main(String[] args) {
        String str = "Welcome to the world";

        ArrayList<Character> al  = new ArrayList<>();

        for (int i=0;i<str.length();i++)
        {
            al.add(str.charAt(i));
        }

        System.out.println(al);
    }
}
