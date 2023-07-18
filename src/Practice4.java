import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();
        System.out.println("table of " + n);
        int i = 1;

        for(i = 1;i<=10;i++){
            int result = n*i;
            System.out.println(n + "*" + i + "=" +result);

        }



    }
}
