package data.structures.linked.list;

public class SingleLinkedList {
	Node head; // head of the list

	/* Linked list Node */

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */

	static class Node {
		public int data;
		public Node next;

		/*
		 * Constructor to create a new node Next is by default initialized as null
		 */
		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		SingleLinkedList sll = new SingleLinkedList();
		//head and node creation 
		sll.head = new Node(1);
		Node second = new Node(20);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(44);
		
		//linked list allignment 
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		sll.printList();
	}

	private void printList() {
		// TODO Auto-generated method stub
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}
