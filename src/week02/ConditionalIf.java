package week02;

import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args) {
		boolean weatherNow, isSnowing;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is it cold outside? Please select true or false:");
		weatherNow = scanner.nextBoolean();

		if (weatherNow) {
			System.out.println("Is it snowing outside? Please select true or false:");
			isSnowing = scanner.nextBoolean();
			if (isSnowing) {
				System.out.println("It must be winter where you live!");
			} else {
				System.out.println("You must not be on the Cresson Mountain!");
			}
		} else {
			System.out.println("You must be very happy!");
		}
	}
}
