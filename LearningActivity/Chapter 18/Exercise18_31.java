import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise18_31 {
	public static void main(String[] args) {
		args = new String[3];
		args[0] = "C:\\Users\\Neo\\eclipse-workspace\\LearningActivity\\Chapter 18\\DirectoryExample2";
		args[1] = "newWord";
		args[2] = "word";
		String dirName = args[0];
		String oldWord = args[1];
		String newWord = args[2];
		File directory = new File(dirName);
		replace(directory, oldWord, newWord);
	}

	public static void replace(File dirName, String oldWord, String newWord) {
		if (dirName.isDirectory()) {
			File[] files = dirName.listFiles();
			for (File f : files) {
				replace(f, oldWord, newWord);
			}
		} else {
			try {
				Scanner input = new Scanner(dirName);
				StringBuilder s1 = new StringBuilder();
				while (input.hasNext()) {
					s1.append(input.nextLine());
					s1.append('\n');
				}
				input.close();

				String s2 = s1.toString().replaceAll(oldWord, newWord);
				PrintWriter output = new PrintWriter(dirName);
				output.write(s2);
				output.close();

				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();

			}
		}
	}
}
