package aa224iu__assign3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner; 


public class WordCount2Main {
	public static void main (String[]args) throws IOException {

		HashWordSet hash = new HashWordSet();
		TreeWordSet tree = new TreeWordSet();
		
		
		Scanner sc = new Scanner(new File("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu__assign3\\words.txt"));
		while(sc.hasNext()) {	
			
			Word x = new Word(sc.next());
			hash.add(x);			
			tree.add(x);			
						
		}
		
		System.out.println(hash.size());
		System.out.println(tree.size());
		sc.close();

	}
}
