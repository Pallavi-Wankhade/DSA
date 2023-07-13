package LinkedList;

import java.util.LinkedList;

public class Llcreation {
	public static void main(String args[])
	{
	LinkedList<String> l1= new LinkedList<>();
	l1.add("A");
	l1.add("B");
	l1.add("C");
	l1.add("D");
	l1.add("E");
	l1.add("F");
	System.out.println("Linked List is "+ l1);
	l1.add(3,"G");					//add element
	System.out.println("Linked List is "+ l1);
	String s=l1.get(4);				//returns element
	System.out.println("Element at index 4 is "+ s);
	l1.set(5,"Z");					//update element
	System.out.println("Linked List is "+ l1);
	l1.remove();
	System.out.println("Linked List is "+ l1);
	l1.remove(2);
	System.out.println("Linked List is "+ l1);

	}

}
