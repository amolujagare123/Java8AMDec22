package StringDemo;

public class SpitDemo2 {

    public static void main(String[] args) {

        String str = "We are learning Java Program";

        String[] stArr = str.split("a");

        for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);

    }
}
