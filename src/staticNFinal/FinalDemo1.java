package staticNFinal;

public class FinalDemo1 {

    final int speed = 100;
    void change()
    {
      //  speed =200;  // final variables cant be changed
    }

    public static void main(String[] args) {

        FinalDemo1 ob = new FinalDemo1();

        ob.change();

        System.out.println(ob.speed);

    }
}
