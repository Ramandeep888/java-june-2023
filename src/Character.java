import java.util.Scanner;

public class Character {
    public static void main(String[] args){
        System.out.println("Welcome to my Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input :");
        char ch = sc.next().charAt(0);
        if(ch=='+'){
            System.out.println("Enter the first no.");
            int n1 = sc.nextInt();
            System.out.println("Enter the second no.");
            int n2 = sc.nextInt();
            int sum = n1 +n2;
            System.out.println("the sum of two numbers:" + sum);

        }else if(ch == '-'){
            System.out.println("Enter the first no.");
            int n1 = sc.nextInt();
            System.out.println("Enter the second no.");
            int n2 = sc.nextInt();
            int sub = n1-n2;
            System.out.println("the sub of two numbers :" +sub);
        }else if(ch == '*'){
            System.out.println("Enter the first no.");
            int n1 = sc.nextInt();
            System.out.println("Enter the second no.");
            int n2 = sc.nextInt();
            int multiplication = n1*n2;
            System.out.println("the multiplication of two numbers :" + multiplication);
        }else if(ch == '/'){
            System.out.println("Enter the first no.");
            int n1 = sc.nextInt();
            System.out.println("Enter the second no.");
            int n2 = sc.nextInt();
            int division = n1/n2;
            System.out.println("the division of two numbers :" + division);
        }else{
            System.out.println("Wrong input");
        }
    }
}
