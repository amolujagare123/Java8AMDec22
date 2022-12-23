package InheritanceDemo.Polymorphism;

public class TvShowroom {
    void channels()
    {
        System.out.println("TvShowroom channels");
    }

    void volume()
    {
        System.out.println("TvShowroom volume");
    }

    void settings()
    {
        System.out.println("TvShowroom settings");
    }
}

class LG extends TvShowroom {
    void channels()
    {
        System.out.println("LG channels");
    }

    void volume()
    {
        System.out.println("LG volume");
    }

    void settings()
    {
        System.out.println("LG settings");
    }
}

class Onida extends TvShowroom{
    void channels()
    {
        System.out.println("Onida channels");
    }

    void volume()
    {
        System.out.println("Onida volume");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }
}

class Samsung extends TvShowroom{
    void channels()
    {
        System.out.println("Samsung channels");
    }

    void volume()
    {
        System.out.println("Samsung volume");
    }

    void settings()
    {
        System.out.println("Samsung settings");
    }
}

class TestOverriding
{
    public static void main(String[] args) {

        TvShowroom tv = new Samsung(); //upcasting
        tv.channels();
        tv.volume();
        tv.settings();

         tv = new Onida();

        tv.channels();
        tv.volume();
        tv.settings();
    }

}
