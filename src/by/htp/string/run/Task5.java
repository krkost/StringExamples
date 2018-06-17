//После каждого слова текста, заканчивающегося заданной под­строкой, вставить указанное слово
package by.htp.string.run;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		File f = new File("resources/task5.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			StringBuilder sB = stringReader(f);
			String subStr = "ship";
			String insertWord = "word";
			System.out.println(sB);
			insertWord(sB, subStr, insertWord);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static StringBuilder stringReader(File f) throws FileNotFoundException {
		Scanner sc = new Scanner(f);
		StringBuilder sB = new StringBuilder("");
		while (sc.hasNext()) {
			sB = sB.append(sc.nextLine());
		}
		sc.close();
		return sB;
	}

	public static void insertWord(StringBuilder sB, String subStr, String insertWord) {
		String word = "";
		int i = 1;
		int j = 0;
		sB.append('>');		
		while (sB.charAt(i) != sB.charAt(sB.length() - 1)) {
			if (sB.charAt(i) == ' ') {
				if (sB.charAt(i) == sB.charAt(sB.length() - 1)) {
					word = sB.substring(j, i);
				}
				word = sB.substring(j, i);
				if (word.endsWith(subStr)) {
					sB.insert(i + 1, insertWord + " ");
				}
				j = i + 1;
			}
			i++;
		}
		sB.deleteCharAt(sB.length()-1);
		System.out.println(sB);
	}

}
