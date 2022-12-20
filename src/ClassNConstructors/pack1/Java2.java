package ClassNConstructors.pack1;

public class Java2 extends Java1{

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 10 ;
        //ob.d = 10.34;
        ob.c = 'f';
        ob.str = "Java";
        ob.display();

        Java2 j2 = new Java2();

        j2.a = 20;
       // j2.d = 89.67;
        j2.c = 'g';

    }
}
