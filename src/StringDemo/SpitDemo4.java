package StringDemo;

public class SpitDemo4 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        // print only the words that ends with 'y'

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ; i++) {

            int l = stArr[i].length();
            //stArr[i] or stArr[0] represents individual string

            if(stArr[i].charAt(l-1)=='y')
              System.out.println(stArr[i]);
        }

    }
}
