package aa224iu__assign1.Exercise_1;

public class CollectionMain {
	public static void main(String[] args) {

		// List
		System.out.println("ArrayIntList" + "\n");
		ArrayIntList x = new ArrayIntList();
		System.out.println(x.isEmpty());
		x.add(1);
		x.add(2);
		x.add(5);
		System.out.println(x);
		x.addAt(3, 1);
		System.out.println(x);
		x.add(10);
		System.out.println(x);
		x.remove(2);
		System.out.println(x);
		System.out.println(x.get(2));
		System.out.println("Collection size : " + x.size());
		System.out.println("At postion : " + x.indexOf(10));
//
//		System.out.println("\n\n" + "ArrayIntStack" + "\n");
//		// Stack
//		ArrayIntStack y = new ArrayIntStack();
//		System.out.println(y.isEmpty());
//		y.push(1);
//		y.push(2);
//		y.push(5);
//		System.out.println(y);
//		System.out.println(y.peek());
//		System.out.println("Collection size : " + y.size());
//		y.pop();
//		System.out.println("Collection size : " + y.size());

	}
}
