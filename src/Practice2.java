import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the alphabet :");
        String st = sc.next();

        char ch = sc.next().charAt(0);


            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("alphabet is vowel");

                } else {
                    System.out.println("alphabet is consonant");
                }
            } else {
                System.out.println("wrong alphabet");
            }
        }


    }


