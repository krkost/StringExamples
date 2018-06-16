//In each word of the text, replace the k-th letter with a given symbol. If k is greater than the word length, do not perform the adjustment.
//StringBuilder

package by.htp.string.run;

public class Task1b {

	public static void main(String[] args) {

		StringBuilder text = new StringBuilder("This is a random long-long text");
		StringBuilder newText = null;
		String str = null;
		char ch = 'b';
		int k = 2;
		int j = 0;
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == ' ' || i == text.length()-1) {
				str = text.substring(j, i);
				if (i == text.length()-1) {
					str = text.substring(j, i+1);
				}
				if (str.length() >= k) {
					StringBuilder tempSB = new StringBuilder(str);
					for (int l = 0; l < tempSB.length() - k + 1; l = l + k) {
						tempSB.setCharAt(l + k - 1, ch);
					}
					System.out.print(tempSB + " ");
				}
				j = i + 1;
			}
		}

	}
}