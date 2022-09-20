package week3ArraysAndMethods;

public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = new int[6];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 8;
		array[4] = 13;
		array[5] = 6;
		
		//write the array in another way
		int[] otherArray = {1, 5, 2, 8, 13, 6};
		
		//print out the first element in the array
		System.out.println(array[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(array[array.length-1]);
		
		//print out the element in the array at position 6. What happens?
		//System.out.println(array[6]);
		
		//print out the element in the array at position -1. What happens?
		//System.out.println(array[-1]);
		
		//write a traditional for loop that prints out each element in the array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//write an enhanced for loop that prints out each element in the array
		int[] table = {1,5,2,6,2,9,8,12,14};
		for (int number : table) {
			System.out.println(number);
		}
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		int sum = 0;
		for (int number : table) {
			sum += number;
		}
		System.out.println(sum);
		
		//create a new variable called average and assign the average value of the array to it
		double average = sum / table.length;
		System.out.println(average);
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int number : table) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] namesArray = {"Sam", "Sally", "Thomas", "Robert","Betty","Andrew","Kyle","Jake"};
		
		//calculate the sum of all the letters in the new array
		int nameSum = 0;
		for (String name : namesArray) {
			nameSum += name.length();
		}
		System.out.println(nameSum);
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing (method written outside public main)
		greet("Betty");
		greet("Andrew");
		greet("Kyle");
		
		//write and test a method that takes a String name and returns a greeting, but does not print anything
		greet2("Jake");
		//System.out.println(greet2("Jake")); will print to make sure your method is working
		
		//String greeting = greet2("Jake"); 
		//System.out.println(greeting); also can be used to print the returned value
		
		//what is the difference between these two methods?
		//one stores the end result for later use, and the other is used immediately 
		
		//write and test a method that takes an array of string and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("This is my string.",18));
		
		//write and test a method that takes an array of string and returns the characters in the string as an array of chars
		String str = "Supercalifragilisticexpialidocious";
		char[] letters = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			letters[i] = str.charAt(i);
		}
		
		for (char each : letters) {
			System.out.println(each);
		}
		
		//write and test a method that take an array of strings and a string and returns true if the string passed exists in the array
		System.out.println(isStringInArray(namesArray, "Betty"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println(getSmallestInArray(table));
		
		//write and test a method that takes an array of double and returns the average
		double[] bigNums = {1234.0, 2345.1, 3456.2, 4567.3, 5678.4, 6789.5};
		System.out.println(getAverageInArray(bigNums));
		
		//write and test a method that takes an array of strings and returns an array of int where each element
		//matches the length of the string at that position
		int[] nameLengths = extractStringLengths(namesArray);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an
		//even number of letters is greater than the sum of those with an odd number of letters
		System.out.println(hasMoreEvenWordCharacters(namesArray));
		
		//write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("rockstar"));
		
	}
	
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public static String greet2(String name) {
		return "Hi, " + name + "!";
	}
	
	public static boolean isStringLongerThanNumber(String string, int numLetters) {
		//if (string.length() > numLetters) {
			//return true;
		//} else {
			//return false;
		
		//another option	
		//if (string.length() > numLetters) {
			//return true;
		//}
		//do not need the else here because if the method returns true first, the code will stop and never get to the line return false
		//return false;
		
		//third option, cleanest
		return string.length() > numLetters;
	}
	
	public static boolean isStringInArray(String[] test, String string) {
		for (String str : test) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static int getSmallestInArray(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static double getAverageInArray(double[] numtable) {
		double sumArray = 0;
		for (double number : numtable) {
			sumArray += number;
		}
		return sumArray / numtable.length;
	}
	
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() %2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	public static boolean isPalindrome(String string) {
		//racecar, mom, wow, bob
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() -i -1)) {
				return false;
			}
		}
		return true;
	}
}
