import java.util.Scanner;

public class NumberAfterDoubleReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0 || num % 10 != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}