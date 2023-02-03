import java.io.*;
import java.util.*;

public class Exercise18_28 {
	public static void main(String[] args) {
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		File file = new File(directory);
		System.out.println(getFileSizeBytes(file)+ " bytes");
		input.close();
	}
	
	private static long getFileSizeBytes(File file) {
		return file.length();
	}
	
}

