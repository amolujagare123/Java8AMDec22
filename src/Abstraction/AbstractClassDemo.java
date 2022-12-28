package Abstraction;

public abstract class AbstractClassDemo {

    abstract void run();
    abstract void start();

    void display()
    {
        System.out.println("this is display");
    }


}

class ChildAbstract extends AbstractClassDemo
{
    void run()
    {
        System.out.println("run");
    }

    void start() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        //AbstractClassDemo ob = new AbstractClassDemo();

        ChildAbstract ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();

        AbstractClassDemo ob2 = new ChildAbstract();
        ob2.run();
        ob2.start();
        ob2.display();
    }


}
