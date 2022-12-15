package ClassNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

       /* int x;
        x = 2 ;
        System.out.println(x);*/
        MyClass ob = new MyClass();

        ob.a = 10 ;
        ob.d = 10.34;
        ob.c = 'f';
        ob.str = "Java";
        ob.display();
        /*System.out.println(ob.a);
        System.out.println(ob.d);
        System.out.println(ob.c);
        System.out.println(ob.str);*/

        MyClass ob2 = new MyClass();

        ob2.a = 22;
        ob2.d =34.54;
        ob2.c = 'a';
        ob2.str = "Selenium";
        ob2.display();

    }
}
