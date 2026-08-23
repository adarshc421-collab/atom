import java.util.Scanner;

class Prime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.print("Prime");
        }
        else {
            System.out.print("Not Prime");
        }

        scn.close();
    }
}