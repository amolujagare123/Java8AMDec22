package ExceptionHandling;

public class CheckNumber {

    void checkNumber(int a) // 1 to 10
    {
        if(a<=10 && a>=1)
            System.out.println("we are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        CheckNumber ob = new CheckNumber();

        int x =71;

        ob.checkNumber(x);

        System.out.println("end of the program");

    }
}
