package aa224iu__assign3;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] test = { 6, -7, 9, -12, -2, 5 };
		String[] testString = { "amata", "fartun", "irene", "ebtisam", "ramin" };
		System.out.println(Arrays.toString(insertionSort(testString, comp)));

		System.out.println(Arrays.toString(insertionSort(test)));
		String[] testString2 = { "amata", "fartun", "irene", "ebtisam", "ramin" };
		System.out.println(Arrays.toString(mergeSort(test)));
		System.out.println(Arrays.toString(mergeSortString(testString2,comp)));
	}

	private static Comparator<String> comp = new Comparator<String>() {
		public int compare(String one, String two) {
			int temp = String.CASE_INSENSITIVE_ORDER.compare(one, two);
			return temp;
		}
	};

	public static int[] insertionSort(int[] in) {
		int[] arr = in;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (0 < arr[j] - arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static String[] insertionSort(String[] in, Comparator<String> c) {
		String[] arr = in;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (0 < comp.compare(arr[j], arr[j + 1])) {
					String temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static int[] mergeSort(int[] in) {
		if (in.length == 1) {
			return in;
		}

		int[] arr = new int[in.length / 2];
		int[] arr2 = new int[in.length - arr.length];

		// copy first half
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in[i];
		}
		// copy 2nd half
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in[arr.length + i];
		}

		mergeSort(arr);
		mergeSort(arr2);
		// first = element in arr
		// second = element in arr2
		// next = next position
		int first = 0, second = 0, next = 0;

		while (first < arr.length && second < arr2.length) {
			if (arr[first] < arr2[second]) {
				in[next] = arr[first];
				first++;
			} else {
				in[next] = arr2[second];
				second++;
			}
			next++;
		}
		// copy arr -> put it in "in"
		while (first < arr.length) {
			in[next] = arr[first];
			first++;
			next++;
		}
		// copy arr2 -> put it in "in"
		while (second < arr2.length) {
			in[next] = arr2[second];
			second++;
			next++;
		}
		return in;

	}

	public static String[] mergeSortString(String[] in, Comparator<String> c) {
		if (in.length <= 1)
			return in;

		String[] arr = new String[in.length / 2];
		String[] arr2 = new String[in.length - arr.length];

		// copy first half
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in[i];
		}
		// copy 2nd half
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in[arr.length + i];
		}
		mergeSortString(arr, c);
		mergeSortString(arr2, c);

		// first = element in arr
		// second = element in arr2
		// next = next position
		int first = 0, second = 0, next = 0;
		
		while (first < arr.length && second < arr2.length) {
			if (c.compare(arr[first], arr2[second]) < 0) {
				in[next] = arr[first];
				first++;
			}
			else {
				in[next] = arr2[second];
				second++;
			}
			next++;
		}
		return in;

	}

}
