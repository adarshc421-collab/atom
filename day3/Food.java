import java.util.Scanner;

class Food {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number(1 to 4)\n1 veg\n2 non veg\n3 staters\n4 cool drinks\n: ");
        int menu = scn.nextInt();

        switch (menu) {
            case 1:
                System.out.print("1:noodels\n2: fried rice\n3: dosa\n4: chapathi");
                break;

            case 2:
                System.out.print("1:chicken biriyani\n2: egg rice\n3: mutton biriyani\n4: fish kaabab");
                break;

            case 3:
                System.out.print("1:gobi\n2: nippat masala\n3: pani puri\n4: chinmuri");
                break;

            case 4:
                System.out.print("1:mounten dew\n2: sprit\n3: pepesi\n4: monster");
                break;

                   }

        scn.close();
    }
}