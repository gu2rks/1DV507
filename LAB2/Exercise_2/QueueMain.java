package aa224iu_assign2.Exercise_2;

import aa224iu_assign2.Exercise_1.LinkedQueue;

public class QueueMain {

	public static void main(String[] args) {
		LinkedQueue link = new LinkedQueue();
		for (int i = 0; i <= 10; i++) {
			link.enqueue(i);
		}
		System.out.println("Linked Queue: " + link.toString());
		System.out.println("Current size: " + link.size());
		System.out.println("Is the queue empty: " + link.isEmpty());
		System.out.println("First element: " + link.first());
		System.out.println("The Last element: " + link.last());
		System.out.println("Removing element: " + link.dequeue());
		System.out.println("Current queue: " + link.toString());

	}
}


