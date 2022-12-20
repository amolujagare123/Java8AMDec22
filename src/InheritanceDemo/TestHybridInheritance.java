package InheritanceDemo;

class Animal1
{
    void eat()
    {
        System.out.println("eat");
    }

}

class Mammal extends Animal1
{
    void walk()
    {
        System.out.println("walk");
    }
}


class Reptile extends Animal1
{
    void crawl()
    {
        System.out.println("crawl");
    }
}

class Tiger extends Mammal
{
    void roar()
    {
        System.out.println("roar");
    }
}

public class TestHybridInheritance {

    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();

        Mammal m = new Mammal();
        m.walk();
        m.eat();

        Reptile r = new Reptile();
        r.crawl();
        r.eat();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();
    }


}
