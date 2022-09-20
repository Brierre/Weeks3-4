package week3ArraysAndMethods;

public class StuckOnQuestion {

	public static void main(String[] args) {

		String myWord = "Supercalifragilisticexpialidocious";
		System.out.println(createCharArray(myWord));

	}
			//write and test a method that takes a string and returns the characters in the string as an array of chars
			public static char[] createCharArray(String str) {
				char[] letters = new char[str.length()];
			
				for (int i = 0; i < str.length(); i++) {
					letters[i] = str.charAt(i);
				}
				for (char letter : letters) {
					
					System.out.print(letter + ", ");
					
				}
			return letters;
			}
			
}
