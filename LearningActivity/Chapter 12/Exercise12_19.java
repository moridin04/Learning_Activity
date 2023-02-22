import java.io.IOException;
import java.util.Scanner;

public class Exercise12_19 {
	public static void main(String[] args) throws IOException {
		int wordCount = 0;
		int lineCount = 0;
		
		String URLString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		
		try {
		java.net.URL url = new java.net.URL(URLString);
		Scanner input = new Scanner(url.openStream());

		while (input.hasNextLine()) {
			lineCount++;
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);
			while (lineScanner.hasNext()) {
				wordCount++;
				String word = lineScanner.next();
			}
			lineScanner.close();
		}

		System.out.println("URL: " + URLString);
		System.out.println("Total number of words: " + wordCount);
		input.close();
		
		System.exit(0);
		
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.InvalidObjectException ex) {
			System.out.println("I/O Errors: no such file");
		} catch (java.net.ConnectException ex) {
			System.out.println("Connection timed out: connect");
		} finally {
			System.out.println("Cannot access URL");
		}


	}
	
}
