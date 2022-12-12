package Arrays.TwoDimentional;

public class Array2DString {

    public static void main(String[] args) {

        String[][] a = new String[5][3];

        a[0][0]= "Abhijeet";
        a[0][1]= "Aditi";
        a[0][2]= "Aishwarya";

        a[1][0]= "Amit";
        a[1][1]= "Bharat";
        a[1][2]= "Darshan";

        a[2][0]= "Dharmik";
        a[2][1]= "Harshini";
        a[2][2]= "Kirti";

        a[3][0]= "Pooja";
        a[3][1]= "Prabhakara";
        a[3][2]= "Ramesh";

        a[4][0]= "Roshan";
        a[4][1]= "Rutuja";
        a[4][2]= "Sachin";

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
