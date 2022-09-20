package week4Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		
		String[] cars = new String[3];
		//can only have 3 cars now, period
		cars[0] = "Camaro";
		cars[1] = "Neon";
		cars[2] = "truck";
		//cannot add indices to the array once it is made (thanks, Steph!)
		
		//a list is like an array, but a different structure that overcomes some limitations of the array
		//a list is an interface, we cannot create an object from a list, we have to create the object from a class that IMPLEMENTS lists, subcategory of list
		//list makes use of a Java construct called generics
		
		//List<E> list of E where E is the generic that will be replaced by the type you're going to use
		//List<String> this is read as 'List of String'
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1); //got rid of soccer, sorry not sorry, soccer
		System.out.println(sports.isEmpty());
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		//cannot use primitive data types, must be objects
		//List<int> numbers = new ArrayList<int>(); will give error
		//luckily, every primitive data type has a corresponding object
		List<Integer> numbers = new ArrayList<Integer>(); // can pass an int or Integer into this! autoboxing or auto-unboxing
		//why List at the front and ArrayList on the other side? No idea, but don't forget it.
		//useful methods on List
		
	}
}
