package StringDemo;

public class RemoveChar {

    public static void main(String[] args) {

        String str = "Aditi is in office with her office friends";

        String[] stArr = str.split("i");

        String result = "";

        for (int i=0;i< stArr.length ; i++) {

            result = result + stArr[i];
        }

        System.out.println(result);

    }
}
