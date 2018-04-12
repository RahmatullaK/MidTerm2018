package datastructure;
import java.util.ArrayList;
import java.util.List;
public class UseArrayList {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();

		/*This is how elements should be added to the array list*/
		obj.add("Shanon");
		obj.add("Henry");
		obj.add("Santa");
		obj.add("Steve");
		obj.add("Kathy");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:"+obj);

		/*Add element at the given index*/
		obj.add(0, "Randy");
		obj.add(1, "Justin");

		/*Remove elements from array list like this*/
		obj.remove("Kathy");
		obj.remove("Harry");
		
		System.out.println("Current array list is:"+obj);

		/*Remove element from the given index*/
		obj.remove(1);

		System.out.println("Current array list is:"+obj);
	}
}




		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	




