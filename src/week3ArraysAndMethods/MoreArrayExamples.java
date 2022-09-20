package week3ArraysAndMethods;

public class MoreArrayExamples {

	public static void main(String[] args) {
		//#1
		int a,b,c,d,e;
		
		a = 13;
		b = 23;
		c = 2;
		d = 45;
		e = 24;
		
		reverseArray(a,b,c,d,e);
		
		//#2
		String word = "Piggly Wiggly";
		charArray(word);
		
		//#3

	}
	
	//#1
	public static void reverseArray(int a, int b, int c, int d, int e) {
		int[] array = {a,b,c,d,e};
		for (int num : array) {
			System.out.println(num);
		}
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	//#2
	public static void charArray(String userWord) {
		char[] letters = new char[userWord.length()];
		
		for (int i = 0; i < userWord.length(); i++) {
			letters[i] = userWord.charAt(i);
		}
		for (char letter : letters) {
			System.out.println(letter);
		}
	}
	
	//#3
	
}
