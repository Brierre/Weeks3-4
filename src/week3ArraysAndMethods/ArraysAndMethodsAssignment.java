package week3ArraysAndMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysAndMethodsAssignment {

	public static void main(String[] args) {
		//#1 create array of int called ages that contains the following values: 3,9,23,64,2,8,28,93

		int[] ages = {3, 9, 23, 64, 2, 28, 93};	
		
		//programmatically subtract the value of the first element in the array from the value in the last element of the array without using ages[7] in the code
		//print this to the console*/
		System.out.println(ages[ages.length-1] - ages[0]);
		System.out.println("Uncomment lines 11 and 15-16, and comment out lines 18-20 to test the first int array and check the dynamic code for printing the last element.");
		//add a new age to your array and repeat the above step to endure it is dynamic (works as the array changes lengths)
//		int[] ages = {3, 9, 23, 64, 2, 28, 93, 112};
//		
//		System.out.println(ages[ages.length-1] - ages[0]);
		
		//use a loop to iterate through the array and calculate the average age. Print result to console
		int averageAge = 0;
		int sum = 0;
		for (int age : ages) {
			sum += age;
			averageAge = sum / ages.length;
		}
		System.out.println("average age: " + averageAge);
		
		//#2 create an array String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//use a loop to iterate through the array and calculate the average number of letters per name. Print to console
		double letters = 0;
		for (String name : names) {
			letters += name.length();
		}
		System.out.println("Average number of letters is: " + letters / (names.length));
		
		//use a loop to iterate through the array again and concatenate all the names together, separated by spaces. Print to console
		String result = "";
		
		for (String name : names) {
			String word = (name + " ");
			result += word;
		}
		System.out.println(result);
			
		//#3 how do you access the last element of the array? find the element at (array.length -1)
		System.out.println("last element: " + ages[ages.length -1]);
		
		//#4 how do you access the first element of the array? find the element at (array[0])
		System.out.println("first element: " + ages[0]);
		
		//#5 create a new array of int called nameLengths
		int[] nameLengths = new int[6];
		
		//write a loop that iterates over the previous names array and add the length of each name to this new array
		//for each entry of nameLengths array, sequentially:
		for (int i = 0; i < nameLengths.length; i++) { 
			String name = names[i];
			nameLengths[i] = name.length();	
			System.out.println(nameLengths[i]);
		}
		
		//#6 write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print result to console
		int totalLength = 0;

		for (String name : names) {
			totalLength += name.length();
		}
		System.out.println("The sum of all name lengths in the array is: " + totalLength);
		
		//call methods below (inside main method)
		//#7
		String word = "Wart";
		System.out.println(multiplyString(word,4));
		
		//#8
		String firstName = "Monty";
		String lastName = "Python";
		String fullName = getFullName(firstName, lastName);
		
		System.out.println(fullName);

		//#9
		int[] numberTable = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		
		System.out.println(isSumGreaterThan100(numberTable));
		
		//#10 
		double[] doublesTable = {12.34,23.45,34.56,45.67};
		
		System.out.println(averageArray(doublesTable));
		
		//#11
		double[] table1 = {262.30, 43.20, 101.97, 15.01, 100.54};
		double[] table2 = {99.99, 5.65, 365.24};
		
		System.out.println(isAverageGreater(table1, table2));
		
		//#12
		double moneyInPocket = 16.00;
		boolean isHotOutside = false;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//#13
		String myWord = "Supercalifragilisticexpialidocious";
		System.out.println("word: " + myWord);
		createCharArray(myWord);

	}
		
		//write methods below (outside of main method):
		// #7 write a method that takes a String, word, and an int, n, as args and
		// returns the word concatenated to itself n number of times
		public static String multiplyString(String word, int n) {
			String result = "";
			for (int i = 0; i < n; i++) {
				result += word;
			}
			return result;
		}

		//#8 write a method that takes two String, firstName and lastName, and returns a full name, first and last
		public static String getFullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		
		//#9 write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
		public static boolean isSumGreaterThan100(int[] table1) {
			int sumTable1 = 0;
			for (int number : table1) {
				sumTable1 += number;
			}
			if (sumTable1 > 100) {
				return true;
			}
			return false;
		}
		
		//#10 write a method that takes an array of double and returns the average of all the elements in the array
		public static double averageArray(double[] table) {
			double addedUp = 0;
			for (double number : table) {
				addedUp += number;
			}
			return addedUp/table.length;
		}
		
		//#11 write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array
		public static boolean isAverageGreater(double[] table1, double[] table2) {
			double avgTable1 = averageArray(table1);
			double avgTable2 = averageArray(table2);
			if (avgTable1 > avgTable2) {
				return true;
			}
			return false;
		}
		
		//#12 write a method called willBuyDrink that takes a boolean isHotOutside and a double moneyInPocket and returns true if it is hot outside and if moneyInPocket is greater than 10.50
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			}
			return false;
			
		}
		
		//#13 write a method of your own that solves a problem. In comments, write what the method does and why you created it
		//write and test a method that takes a string and returns the characters in the string as an array of chars
		public static void createCharArray(String str) { 
			char[] letters = new char[str.length()];
			//for each index of your string starting at the first
			for (int i = 0; i < str.length(); i++) {
				//add the character at that index to the same index of the array
				letters[i] = str.charAt(i); 
			}
			//for each character in the array
			for (char letter : letters) {
				// print each entry in the array, followed by a comma
				System.out.print(letter + ", ");
			}
		}

}
