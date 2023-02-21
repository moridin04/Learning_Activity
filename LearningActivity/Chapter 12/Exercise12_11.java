import java.io.*;
import java.util.Scanner;

public class Exercise12_11 {
	public static void main(String args[]) throws Exception {
		if (args.length != 3) {
			System.out.println("Usage: java Exercise12_11 John filename");
			// args[0] = John
			// args[1] = filename
		}
		
		args[0] = "John";
		args[1] = "C:\\Users\\Neo\\eclipse-workspace\\LearningActivity\\Chapter 12\\filename";

		File sourceFile = new File(args[1]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[1] + " does not exist");
			System.exit(0);
		}
		
		Scanner input = new Scanner(sourceFile);
		StringBuilder s1 = new StringBuilder();
		while (input.hasNext()) {
			s1.append(input.nextLine());
			s1.append('\n');
		}
		input.close();
		
		String s2 = s1.toString().replaceAll(args[0], " ");
		PrintWriter output = new PrintWriter(sourceFile);
		output.println(s2);
		output.close();
		
			}
	
			
			
		}
