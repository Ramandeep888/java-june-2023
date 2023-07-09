import java.util.Scanner;

public class TableOf2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      System.out.println("Table of 2:");
        int i= 1;
       while(i<=10){
            int result = 2*i;
            System.out.println("2*" + i + "=" +result);
            i++;

        }


    }
}
