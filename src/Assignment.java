import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("enter n1 :");
            int n1 = sc.nextInt();
            System.out.println("enter n2 :");
            int n2 = sc.nextInt();
            System.out.println("enter n3:");
            int n3 = sc.nextInt();
            if (n1 > n2 && n1 > n3) {
                System.out.println("first number is greater than other numbers");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println("second number is greater than other numbers");
            } else {
                System.out.println("third number is greater than others");

            }
            System.out.println("Are you okay to exit?");
            System.out.println("press y for yes and n for no");
            String st = sc.next();
        }
    }
