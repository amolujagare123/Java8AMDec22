package ControlStructure;

public class Triangle {

    public static void main(String[] args) {

            int a = 10;
            int b = 80;
            int c = 90;

            if(a+b+c==180  && a>0 && b>0 & c>0 ) {

                if (a == b && b == c)
                    System.out.println("equilateral triangle ");

                if (a != b && a != c && b != c)
                    System.out.println("scalene triangle");

                if (a == 90 || b == 90 || c == 90)
                    System.out.println("right angled triangle");

                if ((a != b && b == c) || (b != c && a == c) || (c != a && a == b))
                    System.out.println("Isosceles triangle");
            }
            else
                System.out.println("this is not a triangle");

    }
}
