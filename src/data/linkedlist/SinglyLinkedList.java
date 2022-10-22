package data.linkedlist;

/**
 * Singly linked list.
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class SinglyLinkedList {
	public static void main(String[] args) {
		// "А", "В", "АА", "ВВ", "А", "ВВ", "А"
		SinglyLinkedList list = new SinglyLinkedList();
		list.add("А"); // +
		list.add("В");
		list.add("АА");
		list.add("ВВ");
		System.out.println(list);
		System.out.println("remove(1)");
		list.remove(1); // +
		System.out.println(list);
		System.out.println("list.get(2) = " + list.get(2)); // +
		list.add(2, "A"); // +
		System.out.println(list);
	}

	private static class Node {
		String value;
		Node next;

		public Node(String value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	Node head;
	int size;
//	Node tail;

	int size() {
		return size;
	}
	private String get(int pos) {
		int i = 0;
		for (Node current = head; current != null; current = current.next) {
			if (pos == i) {
				return current.value;
			}
			i++;
		}
		return null;
	}

	private void add(int pos, String value) {
		size++;
		if (pos == 0) {
			head = new Node(value, head);
			return;
		}
		int i = 0;
		for (Node prev = head; prev != null; prev = prev.next) {
			i++;
			if (pos == i) {
				prev.next = new Node(value, prev.next);
				break;
			}
		}
	}

	private void remove(int pos) {
		// TODO check pos >= 0 and < size
		size--;
		if (pos == 0) {
			head = head.next;
			return;
		}
		int i = 0;
		for (Node prev = head; prev != null; prev = prev.next) {
			i++;
			if (pos == i) {
				prev.next = prev.next.next;
				break;
			}
		}
	}

	private void add(String value) {
		add(size, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Node current = head; current != null; current = current.next) {
			sb.append(current.value);
			sb.append(", ");
		}
		return sb.toString();
	}
}
