package ClassNConstructors;

public class ParameterizedConstructorThis {

    int a;
    double d;
    char c;
    String str; // data member

    ParameterizedConstructorThis(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        ParameterizedConstructorThis ob
                = new ParameterizedConstructorThis(23,65.11,'g',"amol");
        ob.display();


    }
}
