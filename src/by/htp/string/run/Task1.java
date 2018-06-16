//In each word of the text, replace the k-th letter with a given symbol. If k is greater than the word length, do not perform the adjustment.
//String
package by.htp.string.run;

public class Task1 {

	public static void main(String[] args) {

		String text = "I like this long-long test text";
		char symbol = 'b';
		String[] words;
		String newText = "";
		int k = 2;
		String delimeter = " ";

		words = text.split(delimeter);

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > k) {
				char[] word = words[i].toCharArray();
				for (int j = 0; j < word.length - k + 1; j = j + k) {
					word[j + k - 1] = symbol;
				}
				String str = new String(word);
				newText = newText + str + " ";
			}
		}

		System.out.println(newText);

	}

}
