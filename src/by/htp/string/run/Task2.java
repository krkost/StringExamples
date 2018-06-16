package by.htp.string.run;

//In the text, each letter should be replaced by its ordinal number in the alphabet. In the output in one line, print the text 
//with two spaces between the letters, in the next line at the bottom under each letter print its number.

public class Task2 {

	public static void main(String[] args) {
		String text = "Hello world";

		String line = "abcdefghijklmnopqrstuvwxyz";
		int[] numbers = new int[text.length()];

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				numbers[i] = 0;
			}
			for (int j = 0; j < line.length(); j++) {
				if (text.charAt(i) == line.charAt(j)) {
					numbers[i] = j + 1;
				}
			}

		}
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + "   ");
		}
		System.out.println("");
		for (int i: numbers) {
			if (i != 0) {
			System.out.print(i + "  ");
			}
		}
	}

}