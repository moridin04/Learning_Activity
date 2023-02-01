import java.io.File;
import java.util.Scanner;

public class Exercise12_13 {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise12_13 file");
			// args[0] = file
		}

		args[0] = "C:\\Users\\Neo\\eclipse-workspace\\LearningActivity\\Chapter 12\\file";

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(0);
		}

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		Scanner input = new Scanner(sourceFile);
		while (input.hasNextLine()) {
			lineCount++;
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);
			while (lineScanner.hasNext()) {
				wordCount++;
				String word = lineScanner.next();
				charCount += word.length();
			}
			lineScanner.close();
		}

		System.out.println("Total number of characters: " + charCount);
		System.out.println("Total number of words: " + wordCount);
		System.out.println("Total number of lines: " + lineCount);
		input.close();
	}
}
