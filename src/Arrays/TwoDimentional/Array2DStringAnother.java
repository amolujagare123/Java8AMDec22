package Arrays.TwoDimentional;

public class Array2DStringAnother {

    public static void main(String[] args) {

        String[][] a =
                {
                        {"Sachin","Shrungari","Sripasad"},
                        {"Swati","vinutha","yadav singh"},
                        {"Amol","Rahul","rohit"},

                };



        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+a.length); // 5
        System.out.println("col="+a[0].length); // 3


        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++) {
                System.out.print(a[i][j]+"\t\t\t");
            }
            System.out.println();
        }


    }
}
