package InheritanceDemo;


class Bird
{
    void fly()
    {
        System.out.println("fly");
    }
}

class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("sparrowColor");
    }
}

class Crow extends Bird
{
    void crowColor()
    {
        System.out.println("crowColor");
    }
}



public class TestHierarchicalInheritance {

    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();


        Crow c = new Crow();
        c.crowColor();
        c.fly();

    }
}
