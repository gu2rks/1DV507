package aa224iu_assign2.Exercise_1;

public class QueueMain {
	public static void main (String[]args) {
	LinkedQueue nq = new LinkedQueue();
	 nq.enqueue(1);
	 nq.enqueue(2);
	 nq.enqueue(3);
	 System.out.println("size : "+nq.size());
	 System.out.println("first : "+nq.first());
	 System.out.println("last : "+nq.last());
	 System.out.println(nq.dequeue().toString());
	 System.out.println("first : "+nq.first());
	 System.out.println("size : "+nq.size());
	 System.out.println(nq.toString());
	}		
}
