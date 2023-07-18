import java.util.Scanner;
public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of company");
        String name = sc.next();
        Calculator.enterInput(name);
    }
}
