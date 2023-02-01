import java.io.*;
import java.nio.file.*;

public class Exercise12_20 {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java Exercise12_18 srcRootDirectory");
			// args[0] = srcRootDirectory
		}

		String src = args[0];

		for (int i = 1; i <= 34; i++) {
			String chapter = "chapter" + i;
			String chapterPath = src + File.separator + chapter;
			Path path = Paths.get(chapterPath);

			if (!Files.exists(path)) {
				System.out.println("Directory " + chapterPath + " does not exist");
				System.exit(0);
			}

			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (Path file : stream) {
					if (!Files.isRegularFile(file))
						continue; // Checks other files
					if (!file.toString().endsWith(".java"))
						continue; // Checks other files

					// Read
					StringBuilder sb = new StringBuilder();
					try (BufferedReader reader = Files.newBufferedReader(file)) {
						String line;
						while ((line = reader.readLine()) != null) {
							sb.append(line);
							sb.append("\n");
						}
					}

					// Remove
					int index = sb.indexOf("package");
			          if (index != -1) {
			            int endIndex = sb.indexOf(";", index) + 1;
			            sb.delete(index, endIndex);
			          }

					// Write
					try (BufferedWriter writer = Files.newBufferedWriter(file)) {
						writer.write(sb.toString());
					}
				}
			}
		}
	}
}
