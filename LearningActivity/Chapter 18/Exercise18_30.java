import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise18_30 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Exercise12_30 dirName word");
			// args[0] = dirName
			// args[1] = word
			System.exit(0);
		}

		args[0] = "C:\\Users\\Neo\\Documents\\Directory";
		args[1] = "word";
		File file = new File(args[0]);
		search(file, args[1]);

	}

	public static void search(File file, String word) {
		File[] files = file.listFiles();
		long count = 0;
		for (File f : files)
			if (f.isDirectory())
				count += search(f, word);
			else
				count++;
		

		}
	}


/* 
 * 		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				search(f, word);
				
			}
 *  else {
			try {
				Scanner input = new Scanner(file);
				long count = 0;
				while (input.hasNextLine()) {
					count++;
					System.out.println(file.getName() + " " + count + " ");
				}

				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		*/
