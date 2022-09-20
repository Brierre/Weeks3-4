package week02;

public class EvenNumbers {

	public static void main(String[] args) {
		//for loop
		int i, upperLimit = 50;
		System.out.println("Numbers are: ");
		for (i = 0; i <= upperLimit; i++) {
			System.out.println(i + " ");
		}

		for (i = 1; i <= upperLimit; i++) {
			if (i % 5 == 0) 
				System.out.print(i + " ");
		}
	}

}
