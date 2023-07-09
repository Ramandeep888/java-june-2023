import java.util.Scanner;

public class CharacterSwitch {
    public static void main(String[] args){
        System.out.println("Welcome to my Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        System.out.println("Enter the input");
        char ch = sc.next().charAt(0);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        switch(ch){
            case '+':
                int sum = num1+num2;
                System.out.println("the sum of two numbers are : " + sum);
                break;
            case'-':
                int sub =num1 - num2;
                System.out.println("the diff of two numbers are : " + sub);
                break;
            case'*':
                int multiply = num1*num2;
                System.out.println("the multiplication of two numbers are : " + multiply);
                break;
            case'/':
                int division=num1/num2;
                System.out.println("the division of two numbers are : " + division);
                break;
            default:
                System.out.println("invalid numbers");

                }






        }
    }

