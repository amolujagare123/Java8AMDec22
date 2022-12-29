package Abstraction;

public interface InterfaceDemo {

    void run();
    void start();
   void display();
}

interface Interface2
{
    void display();
}

class ParentClass
{
    void test()
    {
        System.out.println("test");
    }
}

class ChildInterface2 extends ParentClass implements InterfaceDemo,Interface2
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}

