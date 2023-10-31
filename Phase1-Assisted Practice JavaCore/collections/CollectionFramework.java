package collections;

import java.util.*;

public class CollectionFramework {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		arraylist.add(500);

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Hai");
		ll.add("Hello");
		ll.add("How are you");
		ll.add("What's up");
		ll.add("Good morning");
		
		HashSet hs=new HashSet();
		hs.add(123);
		hs.add(234);
		hs.add(345);
		hs.add(456);
		hs.add(567);
		
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(101);
		lhs.add(102);
		lhs.add(103);
		lhs.add(104);
		lhs.add(105);
	}
	
}
