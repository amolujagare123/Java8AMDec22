package ControlStructure;

public class SwitchCaseDemo {


    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;

        String operation = "add-Multi";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("Addition="+c);
                break;

            case "sub" : c = a - b;
                System.out.println("Subtraction="+c);
                break;

            case "mult" : c = a * b;
                System.out.println("Multiplication="+c);
                break;

            case "div" : c = a / b;
                System.out.println("Division="+c);
                break;

            case "add-Multi" : c = a + b;
                System.out.println("Addition="+c);
                c = a * b;
                System.out.println("Multiplication="+c);
                break;

            default:
                System.out.println("Wrong choice");
                break;
        }


    }
}
