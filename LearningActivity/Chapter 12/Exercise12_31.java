import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_31 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = scanner.nextInt();
		System.out.print("Enter the gender: ");
		char gender = scanner.next().charAt(0);
		System.out.print("Enter the name: ");
		String name = scanner.next();
		
		File sourceFile = new File("C:\\Users\\Neo\\eclipse-workspace\\LearningActivity\\Chapter 12\\" + "babynameranking" + year + ".txt");
		Scanner fileInput = new Scanner(sourceFile);
		if (!sourceFile.exists()) {
			System.out.println(year + " does not exist");
			System.exit(1);
		}
		
		int ranking = 0;
		try {
			Scanner input = new Scanner(sourceFile);
			while (input.hasNextLine()) {
				ranking++;
				String strCurrentLine = input.nextLine();
				String[] stringArray = strCurrentLine.split("\\s+");
				
				if (stringArray[gender == 'M' ? 1 : 3].equals(name)) {
					System.out.println(name + " is ranked #" + ranking + " in year " + year);
				} else {
					System.out.println("The name " + name + " is not ranked in year " + year);
				}
				
			}
			
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		

	}
}
