package StringDemo;

public class SpitDemo {

    public static void main(String[] args) {

        String str = "We are learning Java Program";

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);

    }
}
