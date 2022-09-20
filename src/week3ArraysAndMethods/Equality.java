package week3ArraysAndMethods;

public class Equality {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		int x = 5;
		int y = 5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
		//primitive vs object, hmmm
		//== checks to see if the two values are the same in memory, it is not ASSIGNING, like the single =
		//thus when you use the == on int values and they check out to be the same, it prints true
		//and when you use String, you need to use .equals() instead because that compares the data within the string
		//otherwise, the String data is NOT the same instance of the object as the other string
		
		String c = new String("Hello");
		String d = c; //points d to the same instance of the object as c, therefore it will be true for equality
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
		
		
		

	}

}
