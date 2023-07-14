import java.util.Scanner;

public class pragra {
    public static void main(String[] args) {
        System.out.println("welcome to my calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for addition ");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("enter the input:");
        int input = sc.nextInt();
        System.out.println("enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        switch (input) {
            case 1:
                int sum = num1 + num2;
                System.out.println("the sum of two numbers are" + sum);
                break;
            case 2:
                int subtraction = num1 - num2;
                System.out.println("the subtraction of two numbers are" + subtraction);
                break;
            case 3:
                int multiplication = num1*num2;
                System.out.println("the multiplication of two numbers are" + multiplication);
                break;
            case 4:
                int division = num1/num2;
                System.out.println("the division of two numbers are" + division);
                break;
            default:
                System.out.println("invalid input");


        }
    }
}
