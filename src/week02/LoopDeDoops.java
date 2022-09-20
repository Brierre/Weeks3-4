package week02;

public class LoopDeDoops {

	public static void main(String[] args) {
		//for loop when you know how many times you need to iterate
		
		
		//while loop when you need to run the code an unknown number of times while a condition is true
		//while you have a key, enter the house
		
		//do while loop runs once and then continues while the condition is true
		//do enter the house, then find your key
		
		//while loop
		int myVar = 1;
		//pretest loop
		while (myVar <= 10) {
			System.out.print(myVar + " ");
			myVar++;
		}
		System.out.println("\nI am out of loop.");
		
		
		//do while loop - post test
		do { //instructions of loop here
		System.out.println(myVar);
		myVar++;
		} while (myVar <= 10);
		
		
	}

}
