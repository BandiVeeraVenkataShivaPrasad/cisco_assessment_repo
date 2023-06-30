package question_1;

public class Main extends  SinglyLinkedList{

	public static void main(String[] args) {
		 // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(11);
        head.next = new Node(22);
        head.next.next = new Node(33);
        head.next.next.next = new Node(44);
        head.next.next.next.next = new Node(55);
        System.out.println("Original Singly LinkedList is:");
        display(head);
        //Removing the middle element
        deleteMiddleElement(head);
        display(head);
	}

}
