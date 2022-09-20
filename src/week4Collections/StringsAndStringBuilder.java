package week4Collections;

public class StringsAndStringBuilder {

	public static void main(String[] args) {
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);

		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		firstName.concat(lastName);
		//System.out.println(firstName.concat(lastName)); //doesn't change the value of firstName
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith"); //using .append() method, we aren't creating new strings in memory
		System.out.println(fullName.toString());
		
		String tripleHi2 = multiplyString2("Hi", 3);
		System.out.println(tripleHi2);
		
		System.out.println(fullName.charAt(5)); //finds the character at the specified index of the string (remember counted from 0+)
//		System.out.println(fullName.deleteCharAt(5)); // oooh now we have Sam Sith. Poor guy.
//		System.out.println(fullName.delete(1, 3)); //removes characters within a specified range of indices
		System.out.println(fullName.indexOf("it")); //gives position of a specific sub
		System.out.println(fullName.replace(4, 9, "Crust"));
		System.out.println(fullName.reverse());
		
		//so use a StringBuilder when you want to manipulate your string, and use a String when you want a constant, non-mutable set of characters
	
	}

	public static String multiplyString(String str, int num) {
		String bigWord = ""; //each time we run this loop, it creates a new string in memory with the new number of concatenations, memory inefficient
		for (int i = 0; i < num; i++) {
			bigWord += str;
		}
		return bigWord;
	}
	
	//refactor above method using StringBuilder (a better way bc a stringbuilder IS mutable, whereas a string is not)
	public static String multiplyString2(String str, int num) {
		StringBuilder bigWord = new StringBuilder();
		for (int i = 0; i < num; i++) {
			bigWord.append(str);
		}
		return bigWord.toString();
	}
	
	//methods on a StringBuilder
	//charAt

}
