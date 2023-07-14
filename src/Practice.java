import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "n";
        do {
            System.out.println("enter first no.");
            int n1 = sc.nextInt();
            System.out.println("enter second no.");
            int n2 = sc.nextInt();
            System.out.println("enter third no.");
            int n3 = sc.nextInt();
            if (n1 > n2 && n1 > n3) {
                System.out.println("n1 is greater than n2 and n3 ");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println(" n2is greater than n1 and n3");
            } else if (n3 > n1 && n3 > n2) {
                System.out.println("n3 is greater than n1 and n2 ");
            } else if (n1 == n2 && n1 == n3) {
                System.out.println("all are equal");
               } else {
                System.out.println("invalid input");
            }
            System.out.println("do you want to exit? press y for yes and n for no");
            input = sc.next();
        } while (input != "y");


    }


                }




























