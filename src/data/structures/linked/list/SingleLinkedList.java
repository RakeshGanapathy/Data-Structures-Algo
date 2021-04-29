package data.structures.linked.list;

public class SingleLinkedList {
	public Node head = null; // head of the list
	public Node tail = null;

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */
	static class Node {
		int data;
		Node next;

		/*
		 * Constructor to create a new node Next is by default initialized as null
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	private void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("nodes available in the single linked list");
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	 void deleteNodeByKey(int key) {
		Node currentNode = head;
		Node previous = null;
		// case 1 : if the key is the first element
		if (currentNode != null && currentNode.data == key) {
			head = currentNode.next;
			System.out.println(key + " found and deleted");
			return;
		}
		// case 2 : if the key is not in the middle of head and tail
		while (currentNode != null && currentNode.data != key) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		// delete the matching node
		if (currentNode != null) {
			previous.next = currentNode.next;
			System.out.println(key + " found and deleted");
		}
		// case 3: the key is not present
		if (currentNode == null) {
			System.out.println(key + " not found");
		}
	}

	public static void main(String[] args) {

		SingleLinkedList sll = new SingleLinkedList();
		sll.addNode(1);
		sll.addNode(2);
		sll.addNode(54);
		sll.addNode(98);
		sll.addNode(0);
		sll.addNode(0);
		sll.addNode(4);
		sll.display();
		sll.deleteNodeByKey(0);
		sll.deleteNodeByKey(0);
		sll.display();
	}
}
