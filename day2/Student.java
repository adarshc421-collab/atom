import java.util.Scanner;

class Student{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your rollno:");
		int rollno = scn.nextInt();
		scn.nextLine();

		System.out.print("Enter your name:");
		String name = scn.nextLine();
		System.out.print("Enter your department:");
		String department = scn.nextLine();

		System.out.println("my name is " + name + " and roll no is " + rollno + " department is " + department);
	}
}