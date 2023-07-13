package LinkedList;

import java.util.LinkedList;

public class ListToArray {
	public static void main(String args[])
	{
	LinkedList <Integer> l2=new LinkedList<>();
	l2.add(10);
	l2.add(20);
	l2.add(30);
	l2.add(40);
	l2.add(50);
	l2.add(60);
	l2.add(70);
	System.out.println("Linked List is "+ l2);
	System.out.println("Size of list is "+l2.size());
	Integer ar[]=new Integer[7];
	l2.toArray(ar);
	System.out.print("New array is ");
	for (Integer elements : l2)
	{
	System.out.print(elements+ " ");
	}
// or	
//	Object[] objArray = l2.toArray();
//	for(Object element : objArray)
//	{	System.out.print(element+ " ");   }
}
}
