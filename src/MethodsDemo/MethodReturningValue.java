package MethodsDemo;

public class MethodReturningValue {

    int myMethod()
    {
        // statements
        int  a = 15;
        return a;
    }

    public static void main(String[] args) {

        MethodReturningValue ob = new MethodReturningValue();
        System.out.println("myMethod value = "+ob.myMethod());

        int y = ob.myMethod();
        System.out.println("y = " +y);

    }

}
