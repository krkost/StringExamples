//In the text after the letter P, if it is not the last in the word, the letter A is incorrectly typed instead of O. Correct the text.

package by.htp.string.run;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Task3 {

	public static void main(String[] args) {

		File f = new File("resources/task3.txt");
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			
			String str = charStreamWorker(f);
			mover(str);			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String charStreamWorker(File f) throws IOException {
		Reader reader = new FileReader(f);
		char[] array = new char[1024];
		reader.read(array);

		return new String(array);
	}
	
	public static void mover (String str) {
		StringBuilder sB = new StringBuilder(str);
		char p = 'p';
		
		for(int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == 'P' && str.charAt(i+1) == 'A') {
				sB.setCharAt(i+1, 'o');
			}
		}
		System.out.println(str);
		System.out.println(sB);
	}

}
