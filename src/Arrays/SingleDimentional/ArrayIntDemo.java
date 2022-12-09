package Arrays.SingleDimentional;

public class ArrayIntDemo {

    public static void main(String[] args) {

        int[] a = new int[6];

        a[0] = 45;
        a[1] = 67;
        a[2] = 87;
        a[3] = 89;
        a[4] = 12;
        a[5] = 98;

        int l = a.length ; // total number of elements in the array
        System.out.println("length="+l); //6

       /* for(int i=0;i<6;i++)
            System.out.println(a[i]);*/

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}
