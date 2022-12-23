package MethodsDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodReturningValue {

    int myMethod()
    {
        // statements
        int  a = 15;
        return a;
    }

    double getDoubleValue()
    {
        double d = 23.45;
        return d;
    }

    char getCharValue()
    {
         char ch = 'h';
        return  ch;
        //return  'h';
    }

    boolean getMyBooleanValue()
    {
        boolean b = true;
        return  b;
    }

    // check the number is positive or not

    boolean checkNumber(int a)
    {
        if (a>0)
            return  true; // positive
        else
            return false;

    }

    String getMyString()
    {
        String str = "This is a demo";
                return str;
       // return "This is a demo";
    }
    // take a parameter string (it will be a date in the form of String)
    // convert that into date object and return
    Date getMydate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(dateStr);
        //return date;
        return sd.parse(dateStr);
    }

    int[] getTheSingleDimensionalArray()
    {
        int[] arr = {67,122,34,56,78,90,11,22,33,57};
        return  arr;
    }

    String[][] getMyTwoDArray()
    {
        String[][] stArr = {
                {"Abhijeet","Amit","Ankita"},
                {"Neha","Kirti","Pooja"},
                {"Bharat","Chandana","Darshan"},
                {"Prabhakara","Rama","Ramesh"},
        };
        return  stArr;
    }

    Object[][] getMyTwoDArray1()
    {
        String[][] stArr = {
                {"Abhijeet","Amit","Ankita"},
                {"Neha","Kirti","Pooja"},
                {"Bharat","Chandana","Darshan"},
                {"Prabhakara","Rama","Ramesh"},
        };
        return  stArr;
    }


    public static void main(String[] args) throws ParseException {

        MethodReturningValue ob = new MethodReturningValue();
        System.out.println("myMethod value = "+ob.myMethod());

        int y = ob.myMethod();
        System.out.println("y = " +y);

        double d = ob.getDoubleValue();

        System.out.println("getDoubleValue  = "+ob.getDoubleValue());
        System.out.println("d  = "+d);

        char c = ob.getCharValue();
        System.out.println("getCharValue  = "+ob.getCharValue());
        System.out.println("c  = "+c);

        boolean value = ob.getMyBooleanValue();
        System.out.println("getMyBooleanValue  = "+ob.getMyBooleanValue());
        System.out.println("value  = "+value);


        if (ob.checkNumber(-10))
            System.out.println("Number is positive");
        else
            System.out.println("Number is negative");

        String s = ob.getMyString();
        System.out.println("getMyString  = "+ob.getMyString());
        System.out.println("s  = "+s);


        System.out.println(ob.getMydate("12/06/2022"));

//  int[] arr = {67,122,34,56,78,90,11,22,33,57};

        System.out.println(ob.getTheSingleDimensionalArray()[7]);

        int x[] = ob.getTheSingleDimensionalArray();

        for (int i=0;i<x.length;i++)
            System.out.print(x[i]+" ");

        System.out.println();

        String[][] st = ob.getMyTwoDArray();

        for (int i=0;i<st.length;i++) // rows
        {
            for (int j=0;j<st[0].length;j++) // col
            {
                System.out.print(st[i][j]+"\t\t");
            }
            System.out.println();
        }
    }


    Object obj = "amol";
    Object obj1 = new Date();

}
