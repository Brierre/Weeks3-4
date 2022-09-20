package week3ArraysAndMethods;

public class ObjectsAndJavaDocs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive different from object in that primitive data types just hold data
		//objects have methods and properties (such as .length)
		//.length is a property of an array, so you do not need () at the end
		//however, with a string, if you use .length() it is a method, you must have () at the end bc you're calling the method
		
		int age = 34;
		
		//primitives are lowercase, objects are capitalized, Java naming convention
		String name = "Sally Mae";
		System.out.println(name.length());
		System.out.println(name.charAt(5)); //String is 0 based for positions, just like arrays
		
		//Scanner s = new Scanner(System.in); //example of another object that begins with capital letter
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);
		
		//what methods are on a string? I'm so glad you asked! Go to JavaDocs and look it up (this is the research for this week)
		
	}

}
