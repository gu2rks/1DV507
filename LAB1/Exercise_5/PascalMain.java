package aa224iu__assign1.Exercise_5;

import java.util.Arrays;
import java.util.Scanner;

public class PascalMain {
	public static void main (String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pascal’s Triangle row = ");
		int row = sc.nextInt();
		System.out.println("Row " + row + " of Pascal's Triangle is "+Arrays.toString(Row(row)));
		
		sc.close();
	}
	
	public static int [] Row(int completedRow) {
		if ( completedRow == 0) { //base case
			int [] firstRow = new int[1]; 
			firstRow [0] = 1;			
			//first row always start with 1
			return firstRow;
		}
		
		else {
			int [] latestRow = Row(completedRow-1); 
			// to base case => first row
			int [] thisRow = nextRow(latestRow); 
			// make the next 2nd, 3rd,..., N Row
			
//			System.out.println("last "+Arrays.toString(latestRow));
			return thisRow;
		}
	}
	
	public static int [] nextRow(int[] previousRow) {
		int[] newRow = new int[previousRow.length+1]; 
		// new row have one more index
		newRow[0] = 1;
		newRow[newRow.length-1] = 1;
		//the first and the last index is always 1
		
		for (int i = 1 ; i < newRow.length-1 ; i++) {
			// from index 1 to the next the last-1 index
			newRow[i] = previousRow[i-1] + previousRow[i];
			//make newRow from previousRow
		}
		
		return newRow;
	}
}

