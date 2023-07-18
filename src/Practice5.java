import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i = 1;
        //     System.out.println("cube of " +n );
        //       for(i=1;i<=n;i++){
        //       System.out.println(i*i*i);
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i % 2 == 0) {

                System.out.println("pragra");


            }
        }
    }
}
