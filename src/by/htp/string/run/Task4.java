//In the text after the k-th character, insert the specified substring.

package by.htp.string.run;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		File f = new File("resources/task4.txt");
		try {
			StringBuilder sB = stringReader(f);
			int k = readNumber();
			String str = readString();

			System.out.println("Init text:\n" + sB);

			insertSubstring(sB, k, str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static StringBuilder stringReader(File f) throws FileNotFoundException {
		Scanner scan = new Scanner(f);
		StringBuilder sB = new StringBuilder("");
		while (scan.hasNext()) {
			sB = sB.append(scan.nextLine());
		}
		scan.close();
		return sB;
	}
	
	public static int readNumber(){
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Input number k:");
		 int result = sc.nextInt();
		 return result;
	 }
	
	public static String readString(){
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Input substring str:");
		 String str = sc.nextLine();
		 return str;
	 }

	public static void insertSubstring(StringBuilder sB, int k, String str) {
		if (sB.length() > k) {
			int length = sB.length();
			for (int i = 0; i < length / k; i++) {
				sB = sB.insert((i + 1) * k + i * str.length(), str);
			}

			System.out.println("After text:\n" + sB);
		} else System.out.println("sB.length < k");
	}
}
