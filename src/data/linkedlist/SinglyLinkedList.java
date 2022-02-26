package data.linkedlist;

/**
 * Singly linked list.
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class SinglyLinkedList<E> {
	static class Node<E> {
		final E value;
		Node<E> next;

		public Node(E value, Node<E> next) {
			this.value = value;
			this.next = next;
		}
	}

	Node<E> first;
	Node<E> last;
	int size = 0;

	public static void main(String[] args) {
		final SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.addLast("1");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.addLast("5");
		list.print();
		// 1, 2, 3
		list.remove(1); // удаляем 2
		list.remove(3); // удаляем 5
		list.print();
		// 1, 3, 4
	}

	private void remove(int index) {
		if (index < 0 || index >= size) {
			return;
		}

		if (size == 1) {
			first = null;
			last = null;
			size--;
			return;
		}
		// size > 1
		Node<E> prev  = this.first;
		for (int i = 0; i < index - 1; i++) {
			prev = prev.next;
		}

		prev.next = prev.next.next;

		// last
		if (prev.next == null) {
			last = prev;
		}
	}

	private void print() {
		Node<E> cur = this.first;
		while (cur != null) {
			System.out.print(cur.value + ", ");
			cur = cur.next;
		}
		System.out.println();
	}

	private void addLast(E value) {
		final Node<E> node = new Node<>(value, null);
		if (size == 0) {
			size++;
			first = node;
			last = node;
			return;
		}
		size++;
		last.next = node;
		last = node;
	}

}
