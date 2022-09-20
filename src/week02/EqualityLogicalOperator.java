package week02;

public class EqualityLogicalOperator {

	public static void main(String[] args) {
		boolean isItRaining = true;
		System.out.println("Is it raining here: " + isItRaining);
		
		//equality operators
		if (9 == 4) //false
			System.out.println("9 is not equal to 4."); //condition is not met, so this won't print
		if (4 == 4) //true
			System.out.println("4 is equal to 4."); //condition is met, so this prints
		if (1 >= 6) //false
			System.out.println("1 is not greater than or equal to 6."); //condition is not met, so this won't print
		if (1 <= 6) //false
			System.out.println("1 is less than or equal to 6."); //condition is met, so this prints
		if (3 != 2) //true
			System.out.println("3 is not equal to 2."); //condition is met, so this prints

		//logical operators
		//it takes one false in an AND(&&) for the entire condition to be false
		if ((5 == 4) && (4 == 4)) {
			System.out.println("Oh Man!");
		}
		//it takes one true in an OR(||) for the entire condition to be true
		if ((5 == 4) || (4 == 4)) {
			System.out.println("Oh Man, the OR worked!");
		}
		//reverse(!)  f = t 
		if (!(5 == 4)) {
			System.out.println("Well, it's not wrong. It is, but it's not.");
		}
	}
}
