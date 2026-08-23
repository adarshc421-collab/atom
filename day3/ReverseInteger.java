import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int reverse = 0;

        while (x != 0) {

            int digit = x % 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
                reverse < Integer.MIN_VALUE / 10) {
                System.out.println(0);
                return;
            }

            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}