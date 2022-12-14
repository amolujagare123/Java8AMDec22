package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            a[0] = 11;
            a[1] = 12;
            a[2] = 31;
            a[3] = 13;
            a[4] = 41;
            a[5] = 15;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("We are inside catch block");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }

        System.out.println("length of a="+a.length);

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
