package week3ArraysAndMethods;

import java.util.Scanner;

public class UserInputLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input, most data we use comes from user input from some point in time, such as a spreadsheet, a google form, line entry, etc.
		Scanner sc = new Scanner(System.in);
		//typically we have used multiple lines of Sysout, and it prints each line of code on a new line
		System.out.println("Hello");
		System.out.println("world");
		
		//here we are going to use System.out.print() so it prints on the same line
		System.out.print("Hello");
		System.out.println(" world");
		
		//next we will use our Scanner to accept user input in response to our question
		System.out.print("Please enter your first name: ");
		//sc.nextLine(); //this will receive the input from the user, when they hit enter, it terminates the process and accepts their input
		//we can also store the user input as a variable, the nextLine method returns a String
		String firstName = sc.nextLine();
		System.out.println("Thank you, " + firstName + ".");
		
		//menu-driven application
		int selection = 0;
		double total = 0;
		
		while (selection != 5) {
		System.out.println("Select an option.");
		System.out.println("1) Add candy bar to shopping cart: $1.99");
		System.out.println("2) Add cheese to shopping cart: $5.99");
		System.out.println("3) Add valve oil to shopping cart: $10.99");
		System.out.println("4) Add kite to shopping cart: $27.99");
		System.out.println("5) Checkout");
		
		selection = sc.nextInt();
		switch (selection) {
		case 1:
			total += 1.99; //total = total + 1.99
			break;
		case 2:
			total += 5.99;
			break;
		case 3:
			total += 10.99;
			break;
		case 4:
			total += 27.99;
			break;
		case 5:
			break;
		default:
			System.out.println("Please pick a valid option.");
		}
		System.out.println("Your total is: $" + total);

		}
	}
}
