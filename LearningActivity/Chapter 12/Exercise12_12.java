import java.io.*;
import java.util.Scanner;

public class Exercise12_12 {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java Exercise12_12 Test.java");
			// args[0] = Test.java
		}
		
		args[0] = "C:\\Users\\Neo\\eclipse-workspace\\LearningActivity\\Chapter 12\\Test.java";
		
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(0);
		}	
		
		// Read File
		Scanner input = new Scanner (sourceFile);
		StringBuilder s1 = new StringBuilder();
			while (input.hasNext()) {
			s1.append(input.nextLine());
			s1.append('\n');
			}
		input.close();
		
		String s2 = s1.toString().replaceAll("\\s*\\s\\{", " \\{");
		PrintWriter output = new PrintWriter(sourceFile);
			output.write(s2);
			output.close();
		
		}
	}

