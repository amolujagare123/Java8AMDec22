package basics;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        int radius;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius=");
        radius = sc.nextInt();

        area = ( 3.14 ) * radius * radius ;

        System.out.println("area="+area);

    }
}
