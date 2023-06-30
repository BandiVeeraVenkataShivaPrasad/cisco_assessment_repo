package question_1;
/*
* 
* 
Write a method that answers the following problem: Accept as input:
list: a singly-linked list
*
Remove the middle element of the list without iterating the list more than once. Assume the list
size cannot be known until traversed.
*
Support your answer with tests.
*
*/


public class SinglyLinkedList {
	public static class Node{
		int value;
		Node next;
		public Node (int value) {
			this.value=value;
			this.next=null;
		}
	}
	//This method will print the singly-linked list
	public static void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	//This method accepts a singly-linked list as an argument and Removes the middle element of the list without iterating the list more than once.
	public static void deleteMiddleElement(Node list) {
		if(list==null || list.next==null) {
			//If the List is empty or has single element, then there will be no middle element to remove
			return;
		}
		Node fast_node = list;
		Node slow_node = list;
		Node prev = null;
		while(fast_node != null && fast_node.next != null) {
			fast_node = fast_node.next.next;
			prev=slow_node;
			slow_node=slow_node.next;
		}
		System.out.println("Singly LinkedList after removing the middle element:"+slow_node.value +" is:"); // Printing the middle element for reference
		prev.next = slow_node.next;  // Removing the Middle Element
	}
}
