import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Exercise12_14 {
	public static void main(String[] args) throws Exception {

		// File:
		// C:\Users\Neo\eclipse-workspace\LearningActivity\Chapter 12\ScoresFile

		BufferedReader input = null;
		String strCurrentLine;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input filename: ");
		String filename = scan.nextLine();
		input = new BufferedReader(new FileReader(filename));
		int total = 0;
		int count = 0;
		while ((strCurrentLine = input.readLine()) != null) {
			String[] stringArray = strCurrentLine.split(" ");
			for (int i = 0; i < stringArray.length; i++) {
				total += Integer.valueOf(stringArray[i].trim());
				count++;
			}
		}
		System.out.println("Total: " + total);
		System.out.println("Average: " + total / count);
		input.close();
		scan.close();
	}
}
