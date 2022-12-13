package StringDemo;

public class SpitDemo6 {

    public static void main(String[] args) {

        String str = "select2-client_country-result-slci-AL";
        // print AL

        String[] stArr = str.split("-");
        // => {"select2","client_country","result","slci","AL"}

       /* for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);*/

        int l = stArr.length;

        System.out.println(stArr[l-1]);


    }
}
