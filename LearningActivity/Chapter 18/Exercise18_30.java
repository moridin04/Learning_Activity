import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise18_30 {
	public static void main(String[] args) {
		args = new String[2];
		args[0] = "C:\\Users\\Neo\\eclipse-workspace\\LearningActivity\\Chapter 18\\DirectoryExample1";
		args[1] = "word";
		String dirName = args[0];
		String word = args[1];
		File directory = new File(dirName);
		find(directory, word);
	}

	public static void find(File dirName, String word) {
		if (dirName.isDirectory()) {
			File[] files = dirName.listFiles();
			for (File f : files) {
				find(f, word);
			}
		} else {
			try {
				Scanner input = new Scanner(dirName);
				int count = 0;
				while (input.hasNextLine()) {
					count++;
					String line = input.nextLine();
					int index = line.indexOf(word);
					if (index != -1) {
						System.out.println(dirName.getName() + " = line " + count);
					}
				}
				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
