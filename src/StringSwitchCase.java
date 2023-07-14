import java.util.Scanner;

public class StringSwitchCase {
    public static void main(String[] args){
        System.out.println("Welcome to my Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println(" press Pragra for address");
        System.out.println("press Cn tower for address");
        System.out.println("enter the input:");
        String name = sc.next();

        switch(name){
            case "Pragra":
                System.out.println("Address of " + name + " is 110 matheson blvd");
                break;
            case"CnTower":
                System.out.println("address of" + name + " is toronto");
                break;
            default:
                System.err.println("invalid name");






        }
    }
}
