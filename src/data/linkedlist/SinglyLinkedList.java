package data.linkedlist;

/**
 * Singly linked list.
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class SinglyLinkedList<T> { //  implements Iterable<T>
	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("J");
		list.add("H");
		System.out.println("2-" + list.get(2)); // получили C
		System.out.println("0-" + list.get(0)); // получили C
		list.remove(0); // удлили B
		list.remove(1); // удлили B
		System.out.println(list);
		list.invert();
		System.out.println(list);
	}

	public void invert() {
		if (head == null) {
			return;
		}
		Node<T> pred = null;
		Node<T> node = head;
		Node<T> next = head.next;
		while (next != null) {
			pred = node;
			node = next;
			next = node.next;

			node.next = pred;
		}
		tail = head;
		tail.next = null;

		head = node;
	}

	static class Node<T> {
		T value;
		Node<T> next;

		public Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}


	}

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

	public void remove(int index) {
		if (index >= size || index < 0) {
			return;
		}
		if (index == 0) {
			head = head.next;
			if (size == 1) {
				tail = head;
			}
			size--;
			return;
		}
		Node<T> nodePred = head;
		for (int i = 1; i < index; i++) {
			nodePred = nodePred.next;
		}
		size--;
		final Node<T> node = nodePred.next;
		final Node<T> next = node.next;
		if (next == null) {
			tail = nodePred;
			return;
		}
		nodePred.next = next;
	}

	public T get(int index) {
		if (index >= size || index < 0) {
			return null;
		}
		Node<T> node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.value;
	}

	public void add(T value) {
		size++;
		if (head == null) {
			head = new Node<>(value, null);
			tail = head;
			return;
		}

		final Node<T> newNode = new Node<>(value, null);
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node<T> node = head;
		while (node != null) {
			sb.append(node.value).append(", ");
			node = node.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
