package aa224iu_assign2.Exercise_2;

import java.util.Iterator;

import aa224iu_assign2.Exercise_1.Queue;

public class circularQueue implements	Queue{
		private Object[] data;
		private int first;
		private int last;
		private int size; 
		private int maxSize;

		public circularQueue() {
			maxSize = 10;
			data = new Object[maxSize];
			size = 0;
			first= 0;
			last = 0;
		}

		

		public int size() {
			return size;
		}

		
		public void enqueue(Object el) {

				data[last] = el;
				last = (last + 1) % data.length;
				size++;
			}


	   public boolean isEmpty() {
		return first == -1 && last == -1;
	}
		
		public Object dequeue() throws IllegalStateException {
			
			Object tmp;
			if (first == last) {
				tmp = data[first];
				first = last = -1;
			} else {
				tmp = data[first];
				first = (first + 1) % size;
			}
			return tmp;
		}
		

		public String toString() {
			int count = (last + size - first) % size + 1;
			StringBuilder output = new StringBuilder("[");
			for (int i = 0; i < count; i++) {
				int index = (first + i) % size;
				output.append(data[index]).append(", ");
			}
			return output.toString().trim() + "]";

		}

		
		public class QueueIterator implements Iterator<Object> {
			
			private int count=0;
			public Object next() {
				return data[count++];}
			@Override
			public boolean hasNext() {
				return count<size;
			}

			}

			public Object remove() {

				return data;

		}


			@Override
			public Object first() {
				return data[first];
				
			}



			@Override
			public Object last() {
				return data[last];
			}
			
			@Override
			public Iterator<Object> iterator() {
				// TODO Auto-generated method stub
				return new QueueIterator ();
			}
			
			
			
	}
		

