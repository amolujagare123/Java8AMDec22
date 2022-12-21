package MethodsDemo;

import ClassNConstructors.MyClass;

import java.util.Date;

public class MethodsTakingArguments {

    void operation(int a)
    {
        System.out.println("======= Single argument =======");
        int x = 10 + a;
        System.out.println("a="+a);
        System.out.println("x="+x);
    }

    void operation2(int a,int b,int c)
    {
        System.out.println("======= Multiple arguments =======");
        int x = 10 + a + b + c;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("x="+x);
    }

    void printCurrentDate(String str , Date date)
    {
        System.out.println("======= Non primitive arguments =======");

        System.out.println("Occasion : "+str);
        System.out.println("date : "+date);
    }

    void operation3(int a,double b,char c)
    {
        System.out.println("======= Different arguments =======");

        int x = 10 + a ;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("x="+x);
    }

    void printObjectValues(MyClass obj)
    {
        System.out.println("======= Printing object values =======");

        obj.display();
    }

    void printArray(int[] arr)
    {
        System.out.println("======= Printing single Dimensional array =======");
        for (int i=0;i<arr.length ; i++)
            System.out.print(arr[i]+"\t");

        System.out.println();
    }

    void printTwoDArray(String[][] arr)
    {
        System.out.println("======= Printing 2 Dimensional array =======");
        for (int i=0;i<arr.length ; i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        MethodsTakingArguments ob = new MethodsTakingArguments();
        ob.operation(150);
        ob.operation2(12,12,11);
        ob.operation3(12,12.45,'g');

        ob.printCurrentDate("No occasion",new Date());

        int[] x = {11,23,14,56,78,90,65};

        ob.printArray(x);

        String[][] stArr = {

                {"abc1","xyz1","pqr1"},
                {"abc2","xyz2","pqr2"},
                {"abc3","xyz3","pqr3"},
                {"abc4","xyz4","pqr4"}
        };

        ob.printTwoDArray(stArr);

        MyClass myClass = new MyClass();

        myClass.a = 10 ;
        myClass.d = 10.34;
        myClass.c = 'f';
        myClass.str = "Java";

        ob.printObjectValues(myClass);
    }
}
