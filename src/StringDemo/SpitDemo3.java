package StringDemo;

public class SpitDemo3 {

    public static void main(String[] args) {

        String str = "We are learning Java Program";

        String[] stArr = str.split("rn"); // character sequence is also allowed

        for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);

    }
}
