import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomerCare {
    public static void main(String[] args){
        System.out.println("Welcome to Customer Care");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input :");
        int input = sc.nextInt();
        switch(input){
            case 1:
            System.out.println("Hii, Welcome to Customer care");
                System.out.println("Press A for Account Balance");
                System.out.println("Press B for Billing Issue");
                System.out.println("Enter a Character");
                char ch = sc.next().charAt(0);
                switch (ch) {
                    case 'A':
                        System.out.println("Enter your Account number");
                        int AccountNumber = sc.nextInt();
                        break;
                    case 'B':
                        System.out.println(" hi ,welcome to the billing department, may i know your issue");
                        break;
                    default:
                        System.out.println(" invalid input .please try again!");

                } break;
            case 2 :
                System.out.println("Bonjour");
                System.out.println("Press C for provide details of issue");
                System.out.println("Press D for enter mobile no.");
                System.out.println("Enter a Character");
                 ch = sc.next().charAt(0);
                switch(ch){
                    case'C':
                        System.out.println("fill all details in given pdf");
                        break;
                    case'D':
                        System.out.println("report the numbers issue");
                        int report = sc.nextInt();
                }
                break;
            default:
                System.out.println("wrong information, try again");







        }
    }
}
