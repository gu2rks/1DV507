package aa224iu__assign1.Exercise_9;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import java.util.stream.Stream;

public class WarAndPeace {
	public static void main (String[]args) {
		try {
			readNSplit("C:\\Temp\\WarAndPeace.txt");
			Stream<String> stream = Arrays.stream(words);
			long wordCount = stream
					.map((w) -> w.replaceAll("[^A-Za-z-']", ""))
					.filter(w -> w.length()>0) // Remove empty words
					.map(w -> w.toLowerCase()) // Convert to lower case
					.distinct() // Remove duplicate words
					.count(); // Count unique words
					System.out.println("Initial word count: "+words.length);
					System.out.println("Unique word count: "+wordCount);
					
			

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String [] words;
	
	public static void readNSplit(String x) throws IOException {
		String temp = new String(Files.readAllLines(Paths.get(x)).toString());
		words = temp.split(" ");		
	}
	
//	public static String clean (String word) {
//		word.replaceAll(regex, replacement)
//	}
	
}
