package aa224iu__assign1.Exercise_3;

import java.util.Scanner;

public class SumMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1+2+...+N , N = ");
		int max = sc.nextInt();
		int min = 1;
		System.out.println(getSum(min, max));

		sc.close();
	}
	
	public static int getSum(int n, int max) {	
		if (n == max) {
			return max;
		} else
			return getSum(n, ((max + n) / 2)) + 
				getSum(((max + n) / 2) + 1, max);

	}

}
