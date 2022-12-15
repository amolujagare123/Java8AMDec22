package ClassNConstructors;

public class MyClassEmptyConstructor {

    int a;
    double d;
    char c;
    String str;

    MyClassEmptyConstructor() // empty constructor
    {

    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClassEmptyConstructor ob = new MyClassEmptyConstructor();

        ob.display();


    }
}
