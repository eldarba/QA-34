package a.exeptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Demo2CheckedExceptions {

	public static void main(String[] args)  {

		String path = "c:/temp/letter.txt";
		File file = new File(path);

		System.out.println(file);
		System.out.println(file.exists());

		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			System.out.println(line);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
