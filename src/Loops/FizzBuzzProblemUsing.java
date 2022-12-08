package Loops;

public class FizzBuzzProblemUsing {

    public static void main(String[] args) {

        String result="";

        for( int i=1 ; i<=30 ; i++)
        {
            System.out.print(i+" ");
            if (i%5==0)
                result="Buzz";

             if (i%3==0)
                    result="Fizz";

                if (i%3==0 && i%5==0)
                    result = result+"Buzz";

            System.out.println(result);
        }
    }
}
