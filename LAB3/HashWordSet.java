package aa224iu__assign3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashWordSet implements WordSet {

	private int sz;
	private Node[] buckets = new Node[10];

	@Override
	public Iterator<Word> iterator() {
		
		return new HashSetIterator();
	}

	@Override
	public void add(Word word) {
		int newHash = word.hashCode();
		if (newHash < 0)
			newHash = -newHash;
		int pos = newHash % buckets.length;
		Node node = buckets[pos]; // First node in list

		// Search list
		while (node != null) {
			if (node.value.equals(word))
				return; // Element found ==> return
			else
				node = node.next; // Next node in list

		}

		// Not found, add new node as first entry
		node = new Node(word);
		node.next = buckets[pos];
		buckets[pos] = node;
		sz++;
		if (sz == buckets.length)
			rehash();

	}

	private void rehash() {
		Node[] temp = buckets; // Copy of old buckets
		buckets = new Node[2 * temp.length]; // New empty buckets
		sz = 0;
		for (Node n : temp) { // Insert old values into new buckets
			if (n == null)
				continue; // Empty bucket
			// if (n != null)
			// break;
			while (n != null) {
				add(n.value); // Add elements again
				n = n.next;
			}
		}
	}

	@Override
	public boolean contains(Word word) {
		int newHash = word.hashCode();
		if (newHash < 0)
			newHash = -newHash;
		int pos = newHash % buckets.length;
		Node node = buckets[pos];
		while (node != null) { // Search list for element
			if (node.value.equals(word))
				return true; // Found!
			else
				node = node.next;
		}
		return false;
	}

	@Override
	public int size() {

		return sz;
	}

	// Private inner classes
	private class Node {
		Word value;
		Node next = null;

		public Node(Word str) {
			value = str;
		}

		public String toString() {
			return value.toString();
		}
	}

	private class HashSetIterator implements Iterator<Word> {
		private int bucket;
		private Node current;

		public HashSetIterator() {
			current = null;
			bucket = -1;
		}

		@Override
		public boolean hasNext() {

			if (current != null && current.next != null)
				return true;
			for (int i = 0; i < buckets.length; i++) {
				if (buckets[i] != null)
					return true;
			}
			return false;
		}

		@Override
		public Word next() {

			if (current != null && current.next != null) {
				current = current.next;
			} else {
				do {
					bucket++;
					if (bucket == buckets.length)
						throw new NoSuchElementException();
					current = buckets[bucket];
				} while (buckets[bucket] == null);
			}
			return current.value;
		}

	}

}
