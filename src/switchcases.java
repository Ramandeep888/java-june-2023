import java.util.Scanner;

public class switchcases {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        int input = sc.nextInt();
        System.out.println("enter the first no.");
        int n1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int n2 = sc.nextInt();
       int result = 0;
        switch (input) {
            case 1:
                result = n1+n2;

                System.out.println("result:" +result );
                break;
            case 2:

                System.out.println("result :" + result);
                break;
            case 3:
                result = n1*n2;
                System.out.println("result :" + result);
                break;
            case 4:
                result = n1/n2;
                System.out.println("result :" + result);
                break;
            default:
                    System.out.println("Wrong input");

        }


    }
}
