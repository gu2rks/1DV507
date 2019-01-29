package aa224iu__assign1.Exercise_4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PrintJavaMain {
	public static void main(String[] args) {

		try {
			Path directory = Paths.get("C:\\Users\\Amata\\Desktop\\java_kurser\\1DV506"); // My PC
			findJava(directory.toFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public static void findJava(File x) throws IOException {

		for (File file : x.listFiles()) {
			if (file.isDirectory())
				findJava(file);
			else if (file.getName().endsWith(".java"))
				printJavaSize(file);
		}

	}

	private static void printJavaSize(File x) throws IOException {
		Stream<String> lines = Files.lines(x.toPath());
		long numOfLines = lines.count();
		System.out.println(" File name : " 
		+ x.getName() + 
		" Size : "
		+ x.length() 
		+ " byte"
		+" [rows] "
		+numOfLines);

	}
}
