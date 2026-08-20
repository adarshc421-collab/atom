import java.util.Scanner;

class UserInput{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = scn.nextLine();
		System.out.print("Enter the age:");
  		int age = scn.nextInt();

		System.out.print("Enter the gpa:");
		double gpa = scn.nextDouble();
     		System.out.print("Enter the aadhar no:");
		long aadharNo = scn.nextLong();
		System.out.print("Enter the DOB:");
		String DOB = scn.next();
		System.out.println("my name is" + name);
		System.out.println("my age is" + age);
		System.out.println("my gpa is" + gpa);
		System.out.println("my aadhar no is" + aadharNo);
		System.out.println("my name is" + name);
	}
}