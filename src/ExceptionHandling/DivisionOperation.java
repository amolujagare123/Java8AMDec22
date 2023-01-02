package ExceptionHandling;

public class DivisionOperation {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 0;

        try {
            c = a / b;
        }
        catch (ArithmeticException e)
        {

        }
        catch (RuntimeException e)
        {

        }
        catch (Exception e)
        {

        }
        catch (Throwable e)
        {

        }
        finally {
            System.out.println(" inside finally");
        }
        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
