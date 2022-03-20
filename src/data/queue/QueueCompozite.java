package data.queue;

import data.linkedlist.SinglyLinkedList;

/**
 * Queue.
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class QueueCompozite<T> {
	public static void main(String[] args) {
		final QueueCompozite<String> list = new QueueCompozite<>();
		list.queue("test1");
		list.queue("test2");
		list.queue("test3");
		System.out.println(list.size());
		System.out.println("получение");
		System.out.println(list.dequeue());
		System.out.println(list.dequeue());
		System.out.println(list.dequeue());
		System.out.println(list.size());

	}

	public int size() {
		return list.size();
	}

	SinglyLinkedList<T> list = new SinglyLinkedList<T>();

	public void queue(T value) {
		list.add(value);
	}

	public T dequeue() {
		return list.remove(list.size() - 1);
	}
}
