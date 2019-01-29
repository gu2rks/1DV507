package aa224iu_assign2.Exercise_1;

import java.util.Iterator;

public class LinkedQueue implements Queue {
	/**Fields*/
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	
	/**
	 * check size of the queue	 * 
	 * @return size of the queue
	 */
	
	@Override
	public int size() {

		return size;
	}
	/**
	 * check if the queue is empty
	 * @return true if the queue is empty
	 */
	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}
	/**
	 * Add object to the end of the queue. 
	 * <code>(head == null &amp;&amp; tail == null)</code> is the frist case when the queue is empty
	 * <code>else</code> add new object by link the old node to the newest one.
	 * @param element Object to be add in queue
	 * 
	 */
	@Override
	public void enqueue(Object element) {
		Node oldTail = tail;
		if (head == null && tail == null) { // Add first element
			tail = new Node(element);
			head = tail;
			size++;
		} else {

			tail = new Node(element);
			oldTail.next = tail;
			size++;
		}
	}
	/**
	 * take out the first object of the queue.
	 * <code>if (head == null)</code> if the queue is empty then throw exception.
	 * <code>Object temp = head.element;
		head = head.next;
		size--;</code>
		create temp and copy the first object. then change the first object to second object.
		Reduce the size after that.
	 * @throws IndexOutOfBoundsException when the queue is empty
	 * @return temp object
	 */

	@Override
	public Object dequeue() throws IndexOutOfBoundsException {
		if (head == null) {
			return new IndexOutOfBoundsException("Queue underflow");
		}
		Object temp = head.element;
		head = head.next;
		size--;
		return temp;
	}
	/**
	 * take a look at the first object in queue
	 * @see aa224iu_assign2.Exercise_1.Queue#first()
	 * @throws IndexOutOfBoundsException when the queue is empty
	 * @return first object with out removing it
	 */
	@Override
	public Object first() throws IndexOutOfBoundsException {
		if (head == null) {
			return new IndexOutOfBoundsException("Queue underflow");
		}
		return head.element;
	}
	/**
	 * take a look at the last object in the queue
	 * @see aa224iu_assign2.Exercise_1.Queue#last()
	 * @throws IndexOutOfBoundsException when the queue is empty
	 * @return last object with out removing it
	 */
	@Override
	public Object last() throws IndexOutOfBoundsException {
		if (head == null) {
			return new IndexOutOfBoundsException("Queue underflow");
		}

		return tail.element;
	}
	
	/**
	 * Print out every object in LinkedQueue 
	 * @see java.lang.Object#toString()
	 * @return string that have every object in the queue.
	 */
	@Override
	public String toString()
	{
		String text = "[ ";
		Iterator<Object> it = iterator();
		while (it.hasNext())
			text += it.next() + (it.hasNext() ? ", " : "");
		text += " ]";
		return text;
	}
	
	/**
	 * call the ObQueueIterator inner class
	 * @see aa224iu_assign2.Exercise_1.Queue#iterator()
	 * @return ObQueueIterator class
	 */
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new ObQueueIterator();
	}
	
	/**
	 * 	Inner class node
	 *  Node contains object and the link that to the next node. 
	 *  Im to lazy to make another class.
	 *	
	 */
	private class Node { // Private inner Node class
		Object element;
		Node next = null;
		/**
		 * @param object to want to be save in queue
		 */
		Node(Object v) {
			element = v;
			next = null;
		}

	}
	/**Inner class*/
	private class ObQueueIterator implements Iterator<Object> {
		private Node node = head;
		/**
		 * 
		 * @see java.util.Iterator#hasNext()
		 * @return true if there is node in the queue
		 */
		@Override
		public boolean hasNext() {
			return node != null;
		}
		/**
		 * @see java.util.Iterator#next()
		 * @return next object in queue;
		 */
		@Override
		public Object next() {
			Object nElement = node.element; // Read current value
			node = node.next; // Move one step ahead
			return nElement;
		}
	}

}
