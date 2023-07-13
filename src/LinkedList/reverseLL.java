package LinkedList;//Program of reverse linkedList
//import java.util.LinkedList;
public class reverseLL
{
	static Node head;
	static class Node 
	{
		int data;
		Node next;
		Node(int d)
		{	data =d;
			next= null;
		}
	}
	static Node reverse (Node head)
	{
	Node prev=null;
	Node cur=head;
	Node next=cur.next;
	while(cur.next!=null) 
	{
		cur.next=prev;
		prev=cur;
		cur=next;
		next=next.next;}
		cur.next=prev;
		head=cur;
		return head;
	}
	void printList(Node node)	{
		while(node !=null)	{
		System.out.println(node.data + " ");
		node=node.next;
	}}
	public static void main(String args[])
	{
			reverseLL  list = new reverseLL();
			reverseLL.head= new Node(10);
			reverseLL.head.next=new Node(20);
			reverseLL.head.next.next= new Node(30);
			reverseLL.head.next.next.next= new Node(40);
			System.out.println("Linked List is ");
			list.printList(head);
			head=reverseLL.reverse(head);
			System.out.println("reverse List is ");
			list.printList(head);
			
	}
	}

