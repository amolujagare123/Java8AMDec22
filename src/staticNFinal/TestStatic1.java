package staticNFinal;

//import static staticNFinal.Student2.college;

/*
import static staticNFinal.Student2.college;
import static staticNFinal.Student2.myMethod1;
import static staticNFinal.Student2.myMethod2;
*/

//import  static staticNFinal.Student2.college;

import static staticNFinal.Student2.*;
public class TestStatic1 {

    public static void main(String[] args) {

        Student2.myMethod1();
        Student2.myMethod2();
        Student2.college = "";


         college = "";
         myMethod1();
         myMethod2();


    }
}
