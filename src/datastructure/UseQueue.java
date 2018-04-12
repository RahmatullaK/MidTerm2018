package datastructure;
import java.util.Queue;
import java.util.LinkedList;

public class UseQueue {

	public static void main(String[] args) {
		Queue<Integer> qi = new LinkedList<>();
		qi.add(30);
		qi.add(150);
		qi.add(45);

//		Integer x = qi.peek();
//		System.out.println(x);

//		x = qi.peek();
	//	System.out.println(x);
		// System.out.println(qi);

       Integer x = qi.poll();
       System.out.println(x);

       x = qi.poll();
       System.out.println(x);

        System.out.println(qi);
//
////
//    Integer x = qi.remove();
//    System.out.println(x);
//
//    x = qi.remove();
//    System.out.println(x);
//
//    x = qi.remove();
//    System.out.println(x);
//
   //System.out.println(qi);
	}
}
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */




