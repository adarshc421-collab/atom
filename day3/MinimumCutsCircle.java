import java.util.Scanner;

public class MinimumCutsCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pieces: ");
        int n = sc.nextInt();

        int cuts;

        if (n == 1) {
            cuts = 0;
        } else if (n % 2 == 0) {
            cuts = n / 2;
        } else {
            cuts = n;
        }

        System.out.println("Minimum cuts: " + cuts);

        sc.close();
    }
}