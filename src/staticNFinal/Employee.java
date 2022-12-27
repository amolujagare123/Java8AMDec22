package staticNFinal;

public final class Employee {

    int salary= 20000;

    /*final*/ void empWork()
    {
        System.out.println("emp Work");
    }


}

class Programmer  /* extends Employee*/{

    int bonus= 2000;

     void empWork()
        {
         System.out.println("programmer Work");
        }

}
