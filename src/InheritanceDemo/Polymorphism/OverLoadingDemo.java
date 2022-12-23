package InheritanceDemo.Polymorphism;

public class OverLoadingDemo {

    int a;
    int b;

    void add()
    {
        a = 10;
        b = 20;
        int c ;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int a,int b)
    {
        int c ;
        c = a + b;
       // c = this.a + this.b;
        System.out.println("c="+c);
    }

    void add(int a,double b)
    {
        double c ;
        c = a + b;
        // c = this.a + this.b;
        System.out.println("c="+c);
    }

    void add(String a,String b)
    {
        String c ;
        c = a + b;
        // c = this.a + this.b;
        System.out.println("c="+c);
    }


    void add(int a,int b,int x)
    {
        int c ;
        c = a + b + x; // 80
        System.out.println("c="+c);
        c = this.a + this.b; // 30
        System.out.println("c="+c);
    }



    public static void main(String[] args) {

        OverLoadingDemo ob = new OverLoadingDemo();
        ob.add();
        ob.add(12,90); // 102
        ob.add(40,40,40); // 120
        ob.add(12,90.89); // 102
        ob.add("Java-","-Selenium"); // 102

    }

}
