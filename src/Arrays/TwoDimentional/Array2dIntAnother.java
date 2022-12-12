package Arrays.TwoDimentional;

public class Array2dIntAnother {

    public static void main(String[] args) {

        int[][] a = {
                {11,12,13},
                {22,2,24},
                {33,34,35},
                {44,45,46}
        };

        for (int i=0;i<a.length;i++)
        {
            for (int j=0; j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
