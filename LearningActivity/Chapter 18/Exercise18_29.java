import java.io.File;
import java.util.Scanner;


public class Exercise18_29 {
	public static void main(String[] args) {
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		System.out.println(getFilesCount(new File(directory)));
		input.close();
	}
	
	public static long getFilesCount(File file) {
		File[] files = file.listFiles();
		long count = 0;
		for (File f : files)
			if (f.isDirectory())
				count += getFilesCount(f);
			else
				count++;
		
		return count;
	}
}
