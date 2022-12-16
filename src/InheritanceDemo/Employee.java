package InheritanceDemo;

public class Employee {

    int salary= 20000;

    void empWork()
    {
        System.out.println("empWork");
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee.salary);
        employee.empWork();

        Programmer programmer = new Programmer();
        System.out.println(programmer.bonus);
        programmer.programmerWork();

        System.out.println(programmer.salary);
        programmer.empWork();
    }
}

class Programmer extends Employee{

    int bonus= 2000;

    void programmerWork()
    {
        System.out.println("programmerWork");
    }


}
