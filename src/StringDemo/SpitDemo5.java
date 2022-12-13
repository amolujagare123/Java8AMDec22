package StringDemo;

public class SpitDemo5 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";
        // print only the words whose second character is 'o'

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ; i++) {

            if(stArr[i].charAt(1)=='o')
              System.out.println(stArr[i]);
        }

    }
}
