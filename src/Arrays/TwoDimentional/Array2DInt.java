package Arrays.TwoDimentional;

public class Array2DInt {

    public static void main(String[] args) {

        int[][] a = new int[5][3];

        a[0][0]= 12;
        a[0][1]= 13;
        a[0][2]= 14;

        a[1][0]= 22;
        a[1][1]= 2;
        a[1][2]= 24;

        a[2][0]= 32;
        a[2][1]= 33;
        a[2][2]= 34;

        a[3][0]= 42;
        a[3][1]= 43;
        a[3][2]= 44;

        a[4][0]= 52;
        a[4][1]= 53;
        a[4][2]= 54;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+a.length); // 5
        System.out.println("col="+a[0].length); // 3

       /* for(int i=0;i<5;i++)
        {
            for (int j=0;j<3;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
*/
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
