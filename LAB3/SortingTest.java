package aa224iu__assign3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortingTest {
	SortingAlgorithms x = new SortingAlgorithms();
	public static int beforeEach = 1;
	public static int afterEach = 1;
	
	@BeforeEach //to be executed before each test
	public void setup() {
		System.out.println("@BeforeEach: " + beforeEach++);
	}
	
	@AfterEach //to be executed after each test
	public void tearDown() {
		System.out.println("@AfterEach: " + afterEach++);
	}
	
	@Test	
	public void testInsertionSort() {
		int[] test1 = { 6, -7, 9, -12, -2, 5 }; 
		int[] newArr = SortingAlgorithms.insertionSort(test1);
		assertEquals("[-12, -7, -2, 5, 6, 9]", Arrays.toString(newArr));
		  
		int[] test2 = {-10, 8, 9, -100, 20};
		int[] nArr = SortingAlgorithms.insertionSort(test2);
		assertEquals("[-100, -10, 8, 9, 20]", Arrays.toString(nArr));

	}
	
	private static Comparator<String> comp = new Comparator<String>() {
		public int compare(String one, String two) {
			int temp = String.CASE_INSENSITIVE_ORDER.compare(one, two);
			return temp;
		}
	};
	
	@Test
	public void testInsertionSortString() {
		String[] test = { "amata", "fartun", "irene", "ebtisam", "ramin" };
		String[] newArr = SortingAlgorithms.insertionSort(test, comp);
		assertEquals("[amata, ebtisam, fartun, irene, ramin]", Arrays.toString(newArr));
		
		String [] str = {"Elephant","Dog","cat","batterfly","ABOW","Fuck","Off"};
		String [] nwStr = SortingAlgorithms.insertionSort(str, comp);		
		assertEquals("[ABOW, batterfly, cat, Dog, Elephant, Fuck, Off]",Arrays.toString(nwStr));
		
		
	}
	
	@Test
	public void testMerge() {
		int[] test = { 6, -7, 9, -12, -2, 5 };
		int[] newArr = SortingAlgorithms.mergeSort(test);
		assertEquals("[-12, -7, -2, 5, 6, 9]",Arrays.toString(newArr));
		
		int[] test2 = {-10, 8, 9, -100, 20};
		int[] nArr = SortingAlgorithms.mergeSort(test2);
		assertEquals("[-100, -10, 8, 9, 20]", Arrays.toString(nArr));
	}
	@Test
	public void testMergString() {
		//da fuq is wrong ? it work on my Main but not here.
		String[] test = { "amata", "fartun", "irene", "ebtisam", "ramin" };
		String[] newArr = SortingAlgorithms.mergeSortString(test, comp);
		assertEquals("[amata, ebtisam, fartun, irene, ramin]", Arrays.toString(newArr));
		
		String [] str = {"Elephant","Dog","cat","batterfly","ABOW","Fuck","Off"};
		String [] nwStr = SortingAlgorithms.mergeSortString(str, comp);		
		assertEquals("[ABOW, batterfly, cat, Dog, Elephant, Fuck, Off]",Arrays.toString(nwStr));
	}
	

}
