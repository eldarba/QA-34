package c.exeptions;

import java.io.File;
import java.io.IOException;

public class Tar1Files {

	// create a directory and a file in it
	public static void main(String[] args) {

		File directory = new File("c:/temp/documents");
		File file = new File(directory, "plans.txt");

		System.out.println(directory);
		System.out.println(file);

		if (!directory.exists()) {
			directory.mkdirs();
			System.out.println("directory created: " + directory);
		} else {
			System.out.println("directory exists: " + directory);
		}

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("file created: " + file);
			} catch (IOException e) {
				System.out.println("file creation failed: " + e.getMessage());
			}
		} else {
			System.out.println("file exists: " + file);
		}

	}

}
