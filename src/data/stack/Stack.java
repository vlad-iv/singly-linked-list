package data.stack;

import data.linkedlist.SinglyLinkedList;

/**
 * Stack.
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class Stack<E> extends SinglyLinkedList<E> {
	public static void main(String[] args) {
		final Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.print();
		// 5, 4, 3, 2, 1
		System.out.println(stack.pop()); // удаляем 5
		System.out.println(stack.pop()); // удаляем 4
		stack.print();
		// 3, 2, 1
	}

	private E pop() {
		if (size == 0) {
			return null;
		}
		if (size == 1) {
			last = null;
		}
		final E value =	 first.value;
		first = first.next;
		size--;
		return value;
	}

	private void push(E value) {
		final Node<E> node = new Node<>(value, first);
		first = node;
		if (size == 0) {
			last = node;
		}
		size++;
	}

}
