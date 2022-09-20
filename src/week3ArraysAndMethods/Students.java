package week3ArraysAndMethods;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create list of data using single lines
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Bill Bailey";
		String studentName3 = "Will Rogers";
		//print this list of data using single lines
		System.out.println("Print using variables, no array created:");
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		//only 6 lines of code in this case, but what if we have 1000 students?!
		
		//to group similar data together, create an array
		//one way to create array:
		//declare the array as a new String[] and place the length of the array in the square brackets
		//String[] students = new String[3];
		//you can populate the list by adding each student using its position in the array like this:
		//students[0] = "Tom Sawyer"; //first element in the array
		//students[1] = "Bill Bailey";
		//students[2] = "Will Rogers";
		
		//another way to create array:
		String[] students = {"Tom Sawyer","Bill Bailey","Will Rogers","Jackie Chan","Gma Betty"};
		
		//to access an element in the array, use the number of the element in square brackets after the array name
		System.out.println("Print array using single line for each element:");
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		//to run code for each item in the array, you can use a loop and iterate through the array
		System.out.println("Standard for loop example:");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		//an enhanced for loop works to print out every element in an array that is easier
		System.out.println("Enhanced for loop example:");
		for (String student : students) { //for each student IN students, do this
			System.out.println(student);
		}
		
		String [] products = new String[7];
		products[0] = "Carrots";
		products[1] = "Bananas";
		products[2] = "Cucumbers";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		products[5] = "Pancake Mix";
		products[6] = "Ziploc Bags";
		
		//enhanced for loop
		for (String product : products) {
			System.out.println(product);
		}
		
		int[] multiplesOf3 = new int[10];
		//write a loop to populate this array
			for (int i = 1; i <= multiplesOf3.length; i++) {
				multiplesOf3[i-1] = i * 3;
				System.out.println("number: " + multiplesOf3[i - 1]);
			}
			//another type of loop that would work without using [i - 1]
			int[] multiplesOf5 = new int[10];
			
			for (int i = 0; i < multiplesOf5.length; i++) {
				multiplesOf5[i] = (i + 1) * 5;
				System.out.println(multiplesOf5[i]);
			}
			
	}

}
