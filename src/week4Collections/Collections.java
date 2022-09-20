package week4Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		//List is a type of collection, is commonly used. There are other collections
		//List, Set, and Map
		
		/*List
		 * 
		 * allows for duplicates
		 * allows null values
		 * keeps the items in the order they were entered (indexed)
		 * Common implementations: ArrayList, LinkedList, Vector
		 * 
		 */
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");		
		students.add("Sam");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		
		/*Set
		 * 
		 * does not allow duplicates
		 * unordered
		 * allows null values
		 * Common implementations: HashSet, LinkedHashSet, TreeSet
		 * 
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alabama");
		states.add("Tennessee");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add(null);
		
		
		System.out.println(states.size());
		System.out.println(states.contains("Delaware")); //.contains() method
		//.isEmpty() method
		//.remove() method
		
		for (String state : states) {
		System.out.println(state);
		}
		
		/*Map 
		 * 
		 * Map<K,V> K is the key and V is the value
		 * 
		 * Key value pairs (dictionary), first value is a key, second value is what the key links to
		 * Values can be duplicates (multiple definitions) but not keys (it's the same word)
		 * Can have null values
		 * ordered or unordered depends on the implementation of the map
		 * Common Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 *  
		 */
		Map<Integer, String> racerPlacements = new HashMap();
		racerPlacements.put(1, "John");
		racerPlacements.put(2, "Kim");
		racerPlacements.put(3, "Ray");
		
		System.out.println(racerPlacements.get(1)); //gets the Key from the map
		
		//racerPlacements.remove(1);
		System.out.println(racerPlacements.size()); //.size() method
		
		Set<Integer> racerKeys = racerPlacements.keySet(); //.keySet method
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values(); //.values() method
			for (String racer : racers) {
				System.out.println(racer);
			}
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make (something) greater by adding to it; increasing");
		dictionary.put("diminish", "to make or become less");
		dictionary.put("ostentatious", "showy");
		
	}

}
