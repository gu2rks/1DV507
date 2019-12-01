package aa224iu__assign3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IdentyfyWordsMain {

	private static String[] text;

	// make plain text
	public static void readNSplit(String x) throws IOException {
		String temp = new String(Files.readAllLines(Paths.get(x)).toString());
		text = temp.split(" ");
	}

	public static void main(String[] agrs) throws IOException {
		readNSplit("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV507\\src\\aa224iu__assign3\\HistoryOfProgramming.txt");
		
		Stream<String> words = Arrays.stream(text).map((w) -> w.replaceAll("[^A-Za-z]", ""));

		String temp = words.collect(Collectors.joining(" "));

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the location that you want to save the file");
		while (sc.hasNext()) {
			String input = sc.nextLine() + "//words.txt";
			File file = new File(input);
			if (file.exists()) {
				System.err.println(file.getName() + "already exitsts. Please try new name.");
			} else if (!file.isAbsolute()) {
				System.err.println("Incorrect location. Please enter correct location.");

			} else if (file.isAbsolute() && !file.exists()) {
				file.createNewFile();
				PrintWriter printOut = new PrintWriter(file);
				printOut.print(temp);
				printOut.close();
				System.out.println("File created successfully.\n" + "you can find your file at this location :\n"
						+ file.getAbsolutePath() + "\n" + "Program ends.");
				System.exit(1);
			}
		}
		sc.close();
	}

}
