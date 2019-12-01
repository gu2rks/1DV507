package aa224iu__assign3;

public class EuclideanMain {
	
	public static void main (String[]args) {
		
		System.out.println(gcd(42,56));
		
	}
	
	
	public static String gcd(int m, int n) {
		String temp = "GCD("+m+","+n+") = ";
		while ( n != 0) {
			int resten = m % n;
			m = n;
			n = resten;
		}
		return temp+m;
	}
}
