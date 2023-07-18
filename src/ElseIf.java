import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args){
        System.out.println("Welcome to my calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int input = sc.nextInt();
       if (input ==1){
           System.out.println("Enter the first no.");
           int n1 = sc.nextInt();
           System.out.println("Enter the second no.");
           int n2 = sc.nextInt();
           int sum = n1 +n2;
           System.out.println("the sum of two numbers are :" +  sum);
       }else if(input ==2){
           System.out.println("Enter the first no.");
           int n1 = sc.nextInt();
           System.out.println("Enter the second no.");
           int n2 = sc.nextInt();
           int subtraction = n1-n2;
           System.out.println("the subtraction of two numbers are :" +subtraction);
       }else if (input == 3){
           System.out.println("Enter the first no.");
           int n1 = sc.nextInt();
           System.out.println("Enter the second no.");
           int n2 = sc.nextInt();
           int multiplication = n1*n2;
           System.out.println("the multiplication of two numbers :" + multiplication);
       }else if (input ==4){
           System.out.println("Enter the first no.");
           int n1 = sc.nextInt();
           System.out.println("Enter the second no.");
           int n2 = sc.nextInt();
           int division = n1/n2;
           System.out.println("the division of two numbers : " + division);
       }else{
           System.out.println("Wrong input");
       }

       }
// makes some changes
    }

