package aa224iu__assign3;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class WordCount1Main  {
	public static void main (String[]args) throws IOException {

		HashSet<Word> hash = new HashSet<>();
		TreeSet<Word> tree = new TreeSet<>();
		
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
