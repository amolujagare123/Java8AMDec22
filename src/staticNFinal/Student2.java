package staticNFinal;

public class Student2 {

    int rno;
    String name ;
    static  String college="ITS";

    void display()  // non-static method
    {
        System.out.println("rno:"+rno); // non-static - allowed
        System.out.println("name:"+name);  // non-static - allowed
        System.out.println("college:"+college);  // static - allowed
        myMethod2(); // static - allowed
        myNonStaticMethod2(); // non-static - allowed
    }
    static void myMethod2()
    {
        System.out.println("static method");
    }
    void myNonStaticMethod2()
    {
        System.out.println("static method");
    }
    static void myMethod1() // static method
    {
   //     System.out.println("rno:"+rno); // non-static - not allowed
   //    System.out.println("name:"+name);  // non-static - not allowed
        System.out.println("college:"+college);  // static-allowed

    //    display(); // non-static - not allowed
        myMethod2(); //  static -  allowed
    //    myNonStaticMethod2(); // non-static - not allowed

    }

    public static void main(String[] args) {

        Student2 s = new Student2();
        s.myMethod1();

        Student2.myMethod1();


    }
}
