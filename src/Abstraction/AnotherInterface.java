package Abstraction;

public interface AnotherInterface {

    void run();
    void start();

    default void display()
    {
        System.out.println("this is display");
    }

    private void display1() // not accessible outside class
    {
        System.out.println("this is display1");
    }


    static void display2()
    {
        System.out.println("this is display");
    }
}

class ChildInterface implements AnotherInterface
{

    public void run()
    {
        System.out.println("run");
    }

    public void start() {
        System.out.println("run");
    }

    public static void main(String[] args) {

        AnotherInterface ob = new ChildInterface();
        ob.start();
        ob.run();

        AnotherInterface.display2();
    }
}
