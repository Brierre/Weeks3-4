package week1VariablesAndOperations;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == equality operator, results in boolean value, either true or false
		System.out.println(2 == 2); //boolean expression
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 < 5);
		
		// && and || are AND and OR, used to combine boolean expressions
		System.out.println(2 == 2 && 1 < 5);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println(2 > 5 || 4 <= 5);
		System.out.println(3 >= 5 || 2 < 2);
		
		//conditional statements
		//if statement, if the expression evaluates to true, the rest of the expression will run
		String name = "Betty";
		if  (name == "Sam" ) {
			System.out.println("It is " + name + "!");
		}
		
		//if else statement evaluates the if, and if that is false, it executes the next block following the else
		if  (name == "Sam" ) {
			System.out.println("It is " + name + "!");
		} else {
			System.out.println("Who even are you?!");
		}
		
		//else if statement contains another set of options. It covers multiple cases. Has to be in order, once a case is true, it doesn't move on
		double costOfMilk = 1.99;
		if (costOfMilk <= 2) {
			System.out.println("Buying 3");
		} else if (costOfMilk <= 3) {
			System.out.println("Buying 2");
		} else {
			System.out.println("Not buying any milk today!");
		}
		
		//switch statement evaluates a variable and provides multiple options 
		char grade = 'A';
		switch (grade) {
			case 'A':
				System.out.println("90%");
				//break statement here or your code will run this option AND the next one, etc. until it is over or until a break command is given
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		}
		//when you have 2 if statements one inside another, check to see if you can flatten them into one using &&
		//if there are multiple options within the first if, this isn't an option	
		if (5 == 5) {
			if (4 == 4) {
				System.out.println("Yes");
			}
		}
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
		
		//loops, first is for loop
		for (int i = 0; i < 10; i++) { //i++ is same as i + 1
			//everything in here runs for each iteration of the loop
			System.out.println("Scoop cup of flour " + (i + 1));
		}
		
		//print only even numbers
		for (int i = 0; i < 100; i+= 2) { //increments by 2, thus will only come up with even numbers upon running
			System.out.println(i);
		}
		//could also iterate through all of the numbers and then print only those that are even using if
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//while loop is good when you need to do something over and over until a condition is met, but you have less knowledge about how many iterations are needed
		//reading from file and you want to do something for each line, but you don't know how many lines there are
		//int x = 0; while (condition here) {}
		int x = 10;
		while (x < 10) {
			System.out.println(x); //this has created an infinite loop so we need the next line to end the process
			x++;
		}
		
		//do while loop, iterates at least once and checks condition at the end of the loop, instead of the beginning
		do { //insert instructions here
			System.out.println(x);
			x++;
		} while (x < 10);
		
		//enhanced for loop, performs an iteration for each item in a collection, a list or an array
		//example: grocery list, for each item on the list, find item, put in cart, purchase
		//example: bill each customer, the word each is a good indicator		
	}

}
