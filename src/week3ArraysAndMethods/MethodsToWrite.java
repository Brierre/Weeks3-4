package week3ArraysAndMethods;

public class MethodsToWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods modularize code so you can refer to it by name, declaring a method does nothing, it is just instructions
		//you have to call or invoke the method to make it DO the instructions
		String firstName = "Bob";
		String lastName = "Ross";
		//String fullName = firstName + " " + lastName; //rather than type out all this code, you could call the method below
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		//to call a method, you use the name of the method and put arguments in the parentheses
		//the arguments are the data that goes into the parameters in the method
		
		//#1
		int[] numbers = {14,15,16,17,17,18,20};
		System.out.println(sumArray(numbers));
		
		//#2
		double[] doublesTable = {12.34,23.45,34.56,45.67};
		System.out.println(averageArray(doublesTable));
		
		//#3
		String word = "Wart";
		System.out.println(multiplyString(word,4));
		
		//mastery progress methods
		int num1 = 55;
		int num2 = 2;
		int num3 = 12;
		System.out.println(returnSum(num1, num2, num3));
		
	}
	public static String createFullName(String x, String y) { //method signature
		//public static access modifiers
		//return type--sometimes they just DO something but they don't have to give something back, called void
		//name of method, named for the action being performed
		//(parameters) are input that the method takes to work, can instantiate for use in the method, but do not need to match the name of parameter, only the type 
		
		//String fullName = x + " " + y;
		//return fullName;
		//OR
		return x + " " + y;
	}
	
	//#1 method that takes an array of ints and returns the sum of all the ints
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	//#2 method that takes an array of double and returns the average of all elements in the array
	public static double averageArray(double[] table) {
		double addedUp = 0;
		for (double number : table) {
			addedUp += number;
		}
		return addedUp/table.length;
	}
	
	//#3 method that takes a String and an int and returns the String concatenated with itself int number of times
	public static String multiplyString(String word, int number) {
		String result = "";
			for (int i = 0; i < number; i++) {
				result += word;
			}
		return result;
	}
	
	//from mastery progress on methods
	/*public static int returnSum(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
		}*/
	public static int returnSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}
