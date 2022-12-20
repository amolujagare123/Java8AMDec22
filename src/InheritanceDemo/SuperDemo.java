package InheritanceDemo;


class Society
{
    int lightBill=12000;

    void totalPendingMaintenance()
    {
        System.out.println("Society totalPendingMaintenance");
    }
    void printSocietyLightBill()
    {
        System.out.println("Society Light bill="+lightBill);
    }
}

class Apartment extends Society
{
    int lightBill=2000;
    void totalPendingMaintenance()
    {
        System.out.println("Apartment totalPendingMaintenance");
    }
    void printApartmentLightBill()
    {
        System.out.println("Apartment Light bill="+lightBill);
        System.out.println("Society Light bill="+super.lightBill);
        totalPendingMaintenance();
        super.totalPendingMaintenance();
    }
}


public class SuperDemo {

    public static void main(String[] args) {

        Apartment a = new Apartment();
        a.printApartmentLightBill();
    }
}
