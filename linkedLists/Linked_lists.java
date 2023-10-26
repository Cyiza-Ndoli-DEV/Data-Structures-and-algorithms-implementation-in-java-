package linkedLists;
import java.util.*;

public class Linked_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> link = new LinkedList<String>();
		
		link.offer("A");
		link.offer("B");
		link.offer("C");
		link.offer("D");
		link.offer("F");
		
		link.add(4, "E"); // has helped me to add letter E to a single linked linkedlist
		//link.remove("E"); // will remove the object
		link.add(6, "G");
		
		//link.addfirst("6"); adds this at the first position 
		// .addLast()
		System.out.println(link.peekFirst()); // prints the first data of the last node
		System.out.println(link);
		
		
		
		

	}

}
