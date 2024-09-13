package co.rays.string_interview_basics;

import java.util.Arrays;

public class ReplaceOccuranceofCharacterWithNumber {

	public static void main(String[] args) {
		String input = "OPENTEXT";
		char charToReplace = 'T';
		if (input.indexOf(charToReplace) == -1) {
			System.out.println("Character Not Present In the String");

		}
		char[] ch = input.toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == charToReplace) {
				ch[i] = String.valueOf(count).charAt(0);
				count++;

			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
