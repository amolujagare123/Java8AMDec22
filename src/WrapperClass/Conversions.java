package WrapperClass;

public class Conversions {

    public static void main(String[] args) {

        String s1 = "23";
        String s2 = "73";

        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println(i1+i2);

        String s3 = "23.56";
        String s4 = "73.78";

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1+f2);

        String s5  = "false";
        boolean b = Boolean.parseBoolean(s5);

        if (b)
            System.out.println("The value is true");
        else
            System.out.println("The value is false");


        String s6 = "d";

        char ch = s6.charAt(0);

        System.out.println("ch="+ch);
    }
}
