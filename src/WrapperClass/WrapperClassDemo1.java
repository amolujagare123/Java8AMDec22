package WrapperClass;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);

       // Integer ii = new Integer(5);
        Integer ii = new Integer(i); // wrapping / boxing
        System.out.println("ii="+ii);

        Integer ii2 = 10; // auto wrapping / auto boxing

        System.out.println("ii2="+ii2);

        int y = ii2.intValue();
        System.out.println("y="+y);

        int z = ii2;
        System.out.println("z="+z);

    }
}
